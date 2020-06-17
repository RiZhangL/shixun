package com.staffhome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffhome.mapper.DocumentMapper;
import com.staffhome.pojo.Document;
import com.staffhome.service.DocumentMapperService;

@Service
public class DocumentMapperServiceImpl implements DocumentMapperService{
	
	@Autowired
	DocumentMapper mapper;

	public void addDoc(Document document) {
		// TODO Auto-generated method stub
		mapper.addDocument(document);
	}

	public List<Document> selectDocument(String title) {
		// TODO Auto-generated method stub
		List<Document> documents = mapper.selectDocument(title);
		return documents;
	}

	public void updateDoc(Document document) {
		// TODO Auto-generated method stub
		mapper.updateDocument(document);
	}

	public void deleteDoc(List<Integer> list) {
		// TODO Auto-generated method stub
		mapper.deleteDocument(list);
	}

	public List<Document> selectAllDoc() {
		// TODO Auto-generated method stub
		List<Document> documents = mapper.selectAllDocuments();
		return documents;
	}

	@Override
	public Document selectDocumentid(String title) {
		// TODO Auto-generated method stub
		Document document = mapper.selectDocumentid(title);
		return document;
	}

	@Override
	public List<Document> selectDocumentuser(String title) {
		// TODO Auto-generated method stub
		List<Document> documents = mapper.selectDocumentuser(title);
		return documents;
	}

}
