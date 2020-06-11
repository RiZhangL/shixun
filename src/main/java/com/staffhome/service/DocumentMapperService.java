package com.staffhome.service;

import java.util.List;

import com.staffhome.pojo.Document;

public interface DocumentMapperService {
	public void addDoc(Document document);
	
	public List<Document> selectDocument(String title);
	
	public void updateDoc(Document document);
	
	public void deleteDoc(int id);

	public List<Document> selectAllDoc();
}
