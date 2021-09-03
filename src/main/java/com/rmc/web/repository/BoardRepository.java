package com.rmc.web.repository;

import com.rmc.web.model.market.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
