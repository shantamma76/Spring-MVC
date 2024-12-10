package com.xworkz.service;

import com.xworkz.dto.HotelRoomDTO;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomServiceImpl implements HotelRoomService{
    @Override
    public boolean verify(HotelRoomDTO hotelRoomDTO) {
        return true;
    }
}
