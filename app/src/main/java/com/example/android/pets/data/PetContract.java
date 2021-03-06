package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by RJ on 20-09-2017.
 */

public final class PetContract {

    private PetContract() {
    }

    public final static class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public final static String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_WEIGHT = "weight";
        public static final String COLUMN_PET_GENDER = "gender";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }


}
