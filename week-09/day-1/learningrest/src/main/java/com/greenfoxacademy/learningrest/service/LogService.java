package com.greenfoxacademy.learningrest.service;

import com.greenfoxacademy.learningrest.model.Log;
import com.greenfoxacademy.learningrest.repo.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public List<Log> getAllLogs() {
        return (List<Log>) logRepository.findAll();
    }

    public void saveLog(Log log) {
        logRepository.save(log);
    }
}
