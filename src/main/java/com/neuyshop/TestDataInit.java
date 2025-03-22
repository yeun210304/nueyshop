package com.neuyshop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.neuyshop.domain.Item;
import com.neuyshop.repository.ItemRepository;

import jakarta.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("상품1", 10000, 10));
        itemRepository.save(new Item("상품2", 20000, 20));
    }

}