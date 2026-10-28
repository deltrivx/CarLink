package com.tencent.bugly.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f3515a = "bugly_db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f3516b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f3517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<o> f3518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, List<o> list) {
        super(context, f3515a + "_", (SQLiteDatabase.CursorFactory) null, f3516b);
        aa.a(context).getClass();
        this.f3517c = context;
        this.f3518d = list;
    }

    private synchronized boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i7 = 0; i7 < 3; i7++) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(strArr[i7])), new String[0]);
            }
        } catch (Throwable th) {
            if (!al.b(th)) {
                th.printStackTrace();
            }
            return false;
        }
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase;
        readableDatabase = null;
        int i7 = 0;
        while (readableDatabase == null && i7 < 5) {
            i7++;
            try {
                readableDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                al.d("[Database] Try to get db(count: %d).", Integer.valueOf(i7));
                if (i7 == 5) {
                    al.e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e7) {
                    e7.printStackTrace();
                }
            }
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        writableDatabase = null;
        int i7 = 0;
        while (writableDatabase == null && i7 < 5) {
            i7++;
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                al.d("[Database] Try to get db(count: %d).", Integer.valueOf(i7));
                if (i7 == 5) {
                    al.e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e7) {
                    e7.printStackTrace();
                }
            }
        }
        if (writableDatabase == null) {
            al.d("[Database] db error delay error record 1min.", new Object[0]);
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS t_ui ( _id INTEGER PRIMARY KEY , _tm int , _ut int , _tp int , _dt blob , _pc text ) ");
                al.c(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS t_lr ( _id INTEGER PRIMARY KEY , _tp int , _tm int , _pc text , _th text , _dt blob ) ");
                al.c(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS t_pf ( _id integer , _tp text , _tm int , _dt blob,primary key(_id,_tp )) ");
                al.c(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS t_cr ( _id INTEGER PRIMARY KEY , _tm int , _s1 text , _up int , _me int , _uc int , _dt blob ) ");
                al.c(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS dl_1002 (_id integer primary key autoincrement, _dUrl varchar(100), _sFile varchar(100), _sLen INTEGER, _tLen INTEGER, _MD5 varchar(100), _DLTIME INTEGER)");
                al.c(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append("CREATE TABLE IF NOT EXISTS ge_1002 (_id integer primary key autoincrement, _time INTEGER, _datas blob)");
                al.c(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS st_1002 ( _id integer , _tp text , _tm int , _dt blob,primary key(_id,_tp )) ");
                al.c(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS t_sla ( _id TEXT NOT NULL , _tm INTEGER NOT NULL , _dt TEXT NOT NULL , PRIMARY KEY(_id) ) ");
                String string = sb2.toString();
                al.c(string, new Object[0]);
                sQLiteDatabase.execSQL(string, new String[0]);
            } catch (Throwable th) {
                if (!al.b(th)) {
                    th.printStackTrace();
                }
            }
            List<o> list = this.f3518d;
            if (list == null) {
                return;
            }
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onDbCreate(sQLiteDatabase);
                } catch (Throwable th2) {
                    if (!al.b(th2)) {
                        th2.printStackTrace();
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        try {
            if (ab.c() >= 11) {
                al.d("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i7), Integer.valueOf(i10));
                List<o> list = this.f3518d;
                if (list != null) {
                    Iterator<o> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onDbDowngrade(sQLiteDatabase, i7, i10);
                        } catch (Throwable th) {
                            if (!al.b(th)) {
                                th.printStackTrace();
                            }
                        }
                    }
                }
                if (a(sQLiteDatabase)) {
                    onCreate(sQLiteDatabase);
                    return;
                }
                al.d("[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f3517c.getDatabasePath(f3515a);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        try {
            al.d("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i7), Integer.valueOf(i10));
            List<o> list = this.f3518d;
            if (list != null) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onDbUpgrade(sQLiteDatabase, i7, i10);
                    } catch (Throwable th) {
                        if (!al.b(th)) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            if (a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
                return;
            }
            al.d("[Database] Failed to drop, delete db.", new Object[0]);
            File databasePath = this.f3517c.getDatabasePath(f3515a);
            if (databasePath != null && databasePath.canWrite()) {
                databasePath.delete();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
