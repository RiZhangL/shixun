package com.staffhome.mapper;

import java.util.List;

import com.staffhome.pojo.Document;

public interface DocumentMapper {
	public List<Document> selectAllDocuments();
	
	public List<Document> selectDocument(String title);
	
	public void updateDocument(Document document);
	
	public void deleteDocument(int id);
	
	public void addDocument(Document document);
}
