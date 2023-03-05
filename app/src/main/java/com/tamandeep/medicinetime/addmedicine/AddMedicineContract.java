package com.tamandeep.medicinetime.addmedicine;

import com.tamandeep.medicinetime.BasePresenter;
import com.tamandeep.medicinetime.BaseView;
import com.tamandeep.medicinetime.data.source.MedicineAlarm;
import com.tamandeep.medicinetime.data.source.Pills;

import java.util.List;



public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
