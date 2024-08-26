package com.demo.post.service.impl;

import com.demo.post.model.repository.*;
import com.demo.post.model.entity.DcategoriesEntity;
import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.domain.DormBookingListModel;
import com.demo.post.model.entity.UsersEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class DormServiceImpl implements DormService {

    private final DormRepository DORMREPOSITORY;
    private final UsersRepository USERSREPOSITORY;
    private final DcategoryRepository DCATEGORYREPOSITORY;
    private final RoomImgRepository ROOMIMGREPOSITORY;
    private final DamenityRepository DAMENITYREPOSITORY;




    public void updateDorms(List<Long> dormIds) {
        System.out.println("dormIds: " + dormIds);
        List<DormsEntity> dormsToUpdate = DORMREPOSITORY.findAllById(dormIds);

        for (DormsEntity dormsEntity : dormsToUpdate) {
            dormsEntity.setStatus("Y");
        }
        DORMREPOSITORY.saveAll(dormsToUpdate);
    }

}
