package com.Lucene;

import org.apache.commons.io.FileUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.*;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.File;

public class LuceneTest {

    @Test
    public void createIndex() throws Exception{

        Directory directory = FSDirectory.open(new File("D:\\FZ\\index").toPath());
        IndexWriter indexWriter = new IndexWriter(directory,new IndexWriterConfig());
        File dir = new File("D:\\AllProjectText");
        File[] files =dir.listFiles();
        for (File f : files){
            String fileName =f.getName();
            String filePath =f.getPath();
            String fileContent = FileUtils.readFileToString(f,"utf-8");
            long fileSize =FileUtils.sizeOf(f);
           // System.out.println(fileName+" " +filePath+" "+fileSize);

            Field fieldName= new TextField("name",fileName,Field.Store.YES);
            Field fieldPath= new TextField("path",filePath,Field.Store.YES);
            Field fieldContend= new TextField("content",fileContent,Field.Store.YES);
            Field fieldSize= new TextField("size",fileSize+"",Field.Store.YES);

            Document document = new Document();
            document.add(fieldName);
            document.add(fieldPath);
            document.add(fieldContend);
            document.add(fieldSize);
            indexWriter.addDocument(document);
        }
        indexWriter.close();
        System.out.println("success");
    }

    @Test
    public void searchIndex() throws  Exception {

        Directory directory = FSDirectory.open(new File("D:\\FZ\\index").toPath());
        IndexReader indexReader = DirectoryReader.open(directory);
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);
        Query query = new TermQuery(new Term("content","spring"));
        TopDocs topDocs = indexSearcher.search(query,10);
        System.out.println("查询总记录数："+ topDocs.totalHits);
        ScoreDoc[] scoreDocs =topDocs.scoreDocs;
        for (ScoreDoc doc : scoreDocs){
            int docId = doc.doc;
            Document document = indexSearcher.doc(docId);
            System.out.println(document.get("name")+" "+document.get("path")+" "+document.get("size"));
            System.out.println(document.get("content"));
            System.out.println("----------------------------------------");

        }
        indexReader.close();
    }

}
