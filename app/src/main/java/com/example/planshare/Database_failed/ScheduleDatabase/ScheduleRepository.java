package com.example.planshare.Database.ScheduleDatabase;

import android.app.Application;

import com.example.planshare.Database.AppDatabase;
import com.example.planshare.Database.DAOS.ScheduleDatabase_DAO_interface;

public class ScheduleRepository {
    private ScheduleDatabase_DAO_interface Schedule_DAO;

    ScheduleRepository(Application application) {
        AppDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }


    public void insert (Word word) {
        new insertAsyncTask(mWordDao).execute(word);
    }

    private static class insertAsyncTask extends AsyncTask<Word, Void, Void> {

        private WordDao mAsyncTaskDao;

        insertAsyncTask(WordDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Word... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
