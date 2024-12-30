package com.example.ooad_project.repositories;
import org.springframework.stereotype.Repository;
import com.example.ooad_project.entities.Return;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReturnRepository extends JpaRepository<Return, Integer> {}
