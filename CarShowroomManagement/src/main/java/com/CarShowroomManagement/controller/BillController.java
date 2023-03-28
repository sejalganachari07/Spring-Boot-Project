package com.CarShowroomManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface BillController {
	@PostMapping("/generate-report")
    public ResponseEntity<String> generateReport(@RequestBody Map<String, Object> requestMap);
    @GetMapping
    public ResponseEntity<List> getBills();
    @PostMapping("/get-pdf")
    public ResponseEntity<byte[]> getPdf(@RequestBody Map<String, Object> requestMap);
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBill(@PathVariable Integer id);
}
