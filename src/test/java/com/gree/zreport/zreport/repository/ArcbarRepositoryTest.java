package com.gree.zreport.zreport.repository;

import com.gree.zreport.zreport.dataobject.Z_REPORT_ARCBAR;
import org.junit.After;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArcbarRepositoryTest {

    @Autowired
    private ArcbarRepository arcbarRepository;

    @Test
    public void findAll() {
        List<Z_REPORT_ARCBAR> all = arcbarRepository.findAll();
        System.out.println(all.size()>0);

    }
    @Test
    public void findByStart() {
        List<Z_REPORT_ARCBAR> all = arcbarRepository.findByState(1);
        System.out.println(all.size()>0);

    }
}