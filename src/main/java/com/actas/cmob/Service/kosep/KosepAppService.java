package com.actas.cmob.Service.kosep;

import com.actas.cmob.DTO.Kosep.*;
import com.actas.cmob.DTO.UserFormDto;
import com.actas.cmob.Mapper.Kosep.KosepDBMapper;
import com.actas.cmob.Mapper.themoon.TheMoonDBMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@Service("KosepAppService")
public class KosepAppService {
    @Autowired
    KosepDBMapper kosepMapper;

    @Autowired
    TheMoonDBMapper TheMoonDBMapper;



    public List<KosepList01Dto> GetTBDA035List(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetTBDA035List(parm);
            default:
                return null;

        }

    }
    public List<KosepPopDto> GetTBCA510ChulStoreList(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetTBCA510ChulStoreList(parm);
            default:
                return null;

        }

    }

    public  List<KosepPopDto> GetPcodeDataList(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetPcodeDataList(parm);
            default:
                return null;

        }

    }

    public  List<KosepCa636Dto> GetTBCA635MoveList(KosepCa636Dto parm){
          return kosepMapper.GetTBCA635MoveList(parm);
    }



    public  KosepPopDto GetPcodeDataList02(KosepPopDto parm){
        return kosepMapper.GetPcodeDataList02(parm);

    }

    public  KosepPopDto GetPcodeDataList03(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetPcodeDataList03(parm);
            default:
                return null;

        }

    }


    public List<KosepPopDto> GetTBCA510IpStoreList(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetTBCA510IpStoreList(parm);
            default:
                return null;

        }

    }

    public List<KosepList01Dto> GetTBDA035ChulList(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetTBDA035ChulList(parm);
            default:
                return null;

        }

    }


/*
    public List<KosepList01Dto> GetTBDA037ChulList(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_KOSEP":
                return kosepMapper.GetTBDA037ChulList(parm);
            case "ERP_THEMOON":
                return TheMoonDBMapper.GetTBDA037ChulList(parm);
            default:
                return null;

        }

    }*/



    public KosepDa037Dto GetLotNoData(HashMap<String,String> parm){
        String dbnm = parm.get("dbnm");
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetLotNoData(parm);
            default:
                return null;

        }

    }
    public KosepDa037Dto GetLotNoList(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.GetLotNoList(parm);
            default:
                return null;

        }

    }


    public String getCa635MaxSeq(KosepCa635Dto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.getCa635MaxSeq(parm);
            default:
                return null;

        }

    }

    public String getDa036MaxSeq(KosepPopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ELV_KDMES":
                return kosepMapper.getDa036MaxSeq(parm);
            default:
                return null;

        }

    }

    public int InsertCA635(KosepCa635Dto parm) {
        int queryResult = 1;


        queryResult = kosepMapper.InsertCA635(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }

    public int InsertCA636(KosepCa636Dto parm) {
        int queryResult = 1;


        queryResult = kosepMapper.InsertCA636(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }



    public int InsertDA036(KosepDa036Dto parm) {
        int queryResult = 1;


        queryResult = kosepMapper.InsertDA036(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }

    public int InsertDa037(KosepDa037Dto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.InsertDa037(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
    public int InsertDa037H(KosepDa037HDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.InsertDa037H(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
    public int UpdateTBda035(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.UpdateTBda035(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
    public int UpdateDA006PANNEL(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.UpdateDA006PANNEL(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
    public int UpdateDA006WINGBADY(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.UpdateDA006WINGBADY(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }


    public int DeleteDA036(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.DeleteDA036(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
    public int DeleteDA037(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.DeleteDA037(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
    public int DeleteDA037H(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.DeleteDA037H(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }


    public int DeleteCA636(KosepCa636Dto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.DeleteCA636(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }

    public int DeleteCA635(KosepCa636Dto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.DeleteCA635(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
 /*   public int DeleteDA035(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = TheMoonDBMapper.DeleteDA035(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }*/
    public int DeleteDA006PAN(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.DeleteDA006PAN(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }
    public int DeleteDA006WIN(KosepPopDto parm) {
        int queryResult = 1;
        queryResult = kosepMapper.DeleteDA006WIN(parm);
        if (queryResult < 1) {
            queryResult = 0;
        }
        return queryResult;
    }








}
