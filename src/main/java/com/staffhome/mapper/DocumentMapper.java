package com.staffhome.mapper;

import java.util.List;

import com.staffhome.pojo.Document;

public interface DocumentMapper {
	public List<Document> selectAllDocuments();
	
	public List<Document> selectDocument(String title);
	
	public List<Document> selectDocumentuser(String title);
	
	public Document selectDocumentid(String title);
	
	public void updateDocument(Document document);
	
	public void deleteDocument(List<Integer> list);
	
	public void addDocument(Document document);
}
