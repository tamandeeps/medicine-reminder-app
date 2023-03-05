package com.tamandeep.medicinetime.alarm;

import com.tamandeep.medicinetime.BasePresenter;
import com.tamandeep.medicinetime.BaseView;
import com.tamandeep.medicinetime.data.source.History;
import com.tamandeep.medicinetime.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
