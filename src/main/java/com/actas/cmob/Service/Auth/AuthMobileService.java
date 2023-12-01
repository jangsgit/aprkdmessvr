package com.actas.cmob.Service.Auth;

import com.actas.cmob.DTO.UserFormDto;
import com.actas.cmob.Mapper.Kosep.KosepDBMapper;
import com.actas.cmob.Mapper.themoon.TheMoonDBMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("AuthMobileService")
public class AuthMobileService {
    @Autowired
    KosepDBMapper kosepMapper;

    @Autowired
    TheMoonDBMapper theMoonDBMapper;

    public UserFormDto GetUserInfo(UserFormDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetUserInfo(parm);
            default:
                return null;

        }

    }




}
