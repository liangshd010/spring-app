package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface MailService {
    public void sendSimpleMailMessage(String to, String subject, String content);
    public void sendMimeMessage(String to, String subject, String content);
    public void sendMimeMessage(String to, String subject, String content, String filePath);
    public void sendMimeMessage(String to, String subject, String content, Map<String, String> rscIdMap);
}
