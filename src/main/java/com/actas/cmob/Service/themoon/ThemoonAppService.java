package com.actas.cmob.Service.themoon;


import com.actas.cmob.DTO.Kosep.KosepList01Dto;
import com.actas.cmob.DTO.Kosep.KosepPopDto;
import com.actas.cmob.DTO.Themoon.*;
import com.actas.cmob.Mapper.themoon.TheMoonDBMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("ThemoonAppService")
public class ThemoonAppService {

    @Autowired
    TheMoonDBMapper TheMoonDBMapper;



    public String TimeCheck(PopDto parm){
        return TheMoonDBMapper.select_time(parm);
    }

    public int LoginCount(LoginLogDto parm){
        int queryResult = 1;
        queryResult = TheMoonDBMapper.LoginCount(parm);
        return queryResult;
    }


    public boolean InsertLog(LoginLogDto parm){
        int queryResult = 1;

        queryResult = TheMoonDBMapper.InsertLog(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);
    }

    public boolean UpdateLog(LoginLogDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.UpdateLog(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);
    }


    public List<ThemoonListDto> TB_CA501list(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.TB_CA501list(parm);
            default:
                return null;

        }

    }

    public List<ThemoonListDto2> Store_Info(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.Store_Info(parm);
            default:
                return null;
        }
    }


    public boolean Update_TB_FPLAN(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.Update_TB_FPLAN(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);
    }


    public boolean Insert_TB_FPLAN_WORK(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.Insert_TB_FPLAN_WORK(parm);
        if(queryResult < 1){
            queryResult = 0;

        }
        return (queryResult > 0);
    }


    public boolean Insert_login_h(LoginLogDto parm){
        int queryResult = 1;

        queryResult = TheMoonDBMapper.Insert_login_h(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);
    }


    public boolean Insert_TB_FPLAN_W030(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.Insert_TB_FPLAN_W030(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);

    }


    public boolean Insert_tb_fplan_owork(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.Insert_tb_fplan_owork(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);

    }


    public boolean INSERT_TB_FPLAN_WPERID(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.INSERT_TB_FPLAN_WPERID(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);

    }

    public boolean INSERT_TB_FPLAN_WTIME(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.INSERT_TB_FPLAN_WTIME(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);
    }



    public List<ThemoonListDto2> Select_List(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.Select_List(parm);
            default:
                return null;
        }
    }

    /**입고취소**/

    public boolean Update_tb_fplan(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.Update_tb_fplan(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);
    }


    public boolean delete_tb_fplan_work(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.delete_tb_fplan_work(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);

    }

    public boolean delete_tb_fplan_owork(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.delete_tb_fplan_owork(parm);
        if(queryResult < 1){
            queryResult = 0;

        }

        return (queryResult > 0);
    }

    public boolean delete_tb_fplan_wperid(PopDto parm){

        int queryResult = 1;

        queryResult  = TheMoonDBMapper.delete_tb_fplan_wperid(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);
    }

    public boolean delete_tb_fplan_w030(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.delete_tb_fplan_w030(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);

    }

    public boolean delete_tb_fplan_wtime(PopDto parm){

        int queryResult = 1;

        queryResult = TheMoonDBMapper.delete_tb_fplan_wtime(parm);
        if(queryResult < 1){
            queryResult = 0;
        }

        return (queryResult > 0);
    }


    public List<ThemoonListDto2>  select_tb_ca630(PopDto parm){

        String dbnm = parm.getDbnm();

        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.select_tb_ca630(parm);
            default:
                return null;
        }

    }

    public List<ThemoonListDto2> select_jaeqty(PopDto parm){

        String dbnm = parm.getDbnm();

        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.select_jaeqty(parm);
            default:
                return null;

        }
    }




    public boolean insert_tb_ca630(PopDto parm){

        int queryResult = 1;

        queryResult  = TheMoonDBMapper.insert_tb_ca630(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);
    }


    public boolean Update_tb_ca630Int(PopDto parm){

        int queryResult = 1;

        queryResult  = TheMoonDBMapper.Update_tb_ca630Int(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);
    }



    public List<ThemoonListDto2> insert_check(PopDto parm){


                return TheMoonDBMapper.insert_check(parm);


    }

    public boolean insert_tb_fplan_sub(PopDto parm){

        int queryResult = 1;
        queryResult = TheMoonDBMapper.insert_tb_fplan_sub(parm);
        if(queryResult < 1){
            queryResult = 0;
        }
        return (queryResult > 0);

    }

    public boolean delete_tb_fplan_sub(PopDto parm){

        int queryReusult = 1;
        queryReusult = TheMoonDBMapper.delete_tb_fplan_sub(parm);
        if(queryReusult < 1){
            queryReusult = 0;
        }
        return (queryReusult > 0);

    }


    public List<ThemoonListDto2> tb_ca630_check(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.tb_ca630_check(parm);
            default:
                return null;
        }
    }



    public List<PopDto> GetContnmList(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.GetContnmList(parm);
            default:
                return null;
        }
    }

    public List<PopDto> GetMidList(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.GetMidList(parm);
            default:
                return null;
        }
    }

    public List<PopDto> GetPerList(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.GetPerList(parm);
            default:
                return null;
        }

    }

    public List<PopDto> cltnmList(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.cltnmList(parm);
            default:
                return null;
        }
    }

    public List<DA036Dto> Get_DA036_PROC(PopDto parm)
    {
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.Get_DA036_PROC(parm);
            default:
                return null;
        }
    }

    public List<PopDto> GETDATE_PROC(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.GETDATE_PROC(parm);
            default:
                return null;
        }
    }

    public List<DA099Dto> Get_DA099_PROC(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.Get_DA099_PROC(parm);
            default:
                return null;
        }
    }



    public List<PopDto> storelist(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.storelist(parm);
            default:
                return null;
        }

    }



    public List<PopDto> pgunlist(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.pgunlist(parm);
            default:
                return null;
        }

    }


    public List<PopDto> agrdlist(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.agrdlist(parm);
            default:
                return null;
        }

    }

    public List<PopDto> pnamelist(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.pnamelist(parm);
            default:
                return null;
        }

    }

    public List<PopDto> bgrdlist(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.bgrdlist(parm);
            default:
                return null;
        }

    }


    public List<CA602_01> Get_CA602_01_PROC(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.Get_CA602_01_PROC(parm);
            default:
                return null;
        }

    }

    public List<PopDto> Get_date_proc(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.Get_date_proc(parm);
            default:
                return null;
        }
    }


    public List<PopDto> TB_JC002(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.TB_JC002(parm);
            default:
                return null;
        }
    }


    public List<DIVICDDto> SP_PLAN_WORK_DIVI(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.SP_PLAN_WORK_DIVI(parm);
            default:
                return null;
        }
    }

    public List<UsersDto> userAuthcheck(PopDto parm){
        String dbnm = parm.getDbnm();
        switch (dbnm){
            case "ERP_THEMOON":
                return TheMoonDBMapper.userAuthcheck(parm);
            default:
                return null;
        }

    }

}

