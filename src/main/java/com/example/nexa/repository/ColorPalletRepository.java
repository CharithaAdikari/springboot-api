package com.example.nexa.repository;

import com.example.nexa.entity.ColorPallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorPalletRepository extends JpaRepository<ColorPallet, Long> {
}
