package com.harvest.strawberries.rate.mapper;

import com.harvest.strawberries.rate.create.Rate;
import com.harvest.strawberries.rate.find.RateDto;

public class RateToRateDtoMapper {

    public static RateDto rate(Rate rate) {

        return RateDto.builder()
                .cropped(rate.getBasketCropped())
                .unsorted(rate.getBasketUnsorted())
                .sorted(rate.getBasketSorted())
                .build();
    }
}