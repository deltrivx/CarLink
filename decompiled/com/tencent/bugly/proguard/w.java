package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3512a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static w f3513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static x f3514c;

    private w(Context context, List<o> list) {
        f3514c = new x(context, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int a(String str, String str2, String[] strArr, v vVar) {
        int iDelete;
        iDelete = 0;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3514c.getWritableDatabase();
            iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
            if (f3512a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th) {
            try {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
                if (f3512a && writableDatabase != null) {
                }
            } catch (Throwable th2) {
                if (f3512a && writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th2;
            }
        }
        return iDelete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Cursor a(boolean z10, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, v vVar) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f3514c.getWritableDatabase();
            if (writableDatabase != null) {
                cursorQuery = writableDatabase.query(z10, str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
        }
        return cursorQuery;
    }

    public static synchronized w a() {
        return f3513b;
    }

    public static synchronized w a(Context context, List<o> list) {
        try {
            if (f3513b == null) {
                f3513b = new w(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3513b;
    }

    private static y a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            y yVar = new y();
            yVar.f3519a = cursor.getLong(cursor.getColumnIndex("_id"));
            yVar.f3520b = cursor.getInt(cursor.getColumnIndex("_tp"));
            yVar.f3521c = cursor.getString(cursor.getColumnIndex("_pc"));
            yVar.f3522d = cursor.getString(cursor.getColumnIndex("_th"));
            yVar.f3523e = cursor.getLong(cursor.getColumnIndex("_tm"));
            yVar.f3525g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return yVar;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(int i7, String str, v vVar) {
        boolean z10;
        String strConcat;
        z10 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f3514c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (ap.b(str)) {
                        strConcat = "_id = ".concat(String.valueOf(i7));
                    } else {
                        strConcat = "_id = " + i7 + " and _tp = \"" + str + "\"";
                    }
                    int iDelete = writableDatabase.delete("t_pf", strConcat, null);
                    al.c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!al.a(th)) {
                            th.printStackTrace();
                        }
                        if (f3512a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    } catch (Throwable th2) {
                        if (f3512a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th2;
                    }
                }
            }
            if (f3512a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i7, String str, byte[] bArr, v vVar) {
        try {
            y yVar = new y();
            yVar.f3519a = i7;
            yVar.f3524f = str;
            yVar.f3523e = System.currentTimeMillis();
            yVar.f3525g = bArr;
            return b(yVar);
        } catch (Throwable th) {
            if (al.a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private static y b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            y yVar = new y();
            yVar.f3519a = cursor.getLong(cursor.getColumnIndex("_id"));
            yVar.f3523e = cursor.getLong(cursor.getColumnIndex("_tm"));
            yVar.f3524f = cursor.getString(cursor.getColumnIndex("_tp"));
            yVar.f3525g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return yVar;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private synchronized boolean b(y yVar) {
        ContentValues contentValuesD;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3514c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesD = d(yVar)) == null) {
                if (f3512a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            }
            long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesD);
            if (jReplace < 0) {
                if (f3512a) {
                    writableDatabase.close();
                }
                return false;
            }
            al.c("[Database] insert %s success.", "t_pf");
            yVar.f3519a = jReplace;
            if (f3512a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
                return false;
            } finally {
                if (f3512a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    private static ContentValues c(y yVar) {
        if (yVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j5 = yVar.f3519a;
            if (j5 > 0) {
                contentValues.put("_id", Long.valueOf(j5));
            }
            contentValues.put("_tp", Integer.valueOf(yVar.f3520b));
            contentValues.put("_pc", yVar.f3521c);
            contentValues.put("_th", yVar.f3522d);
            contentValues.put("_tm", Long.valueOf(yVar.f3523e));
            byte[] bArr = yVar.f3525g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00cc A[Catch: all -> 0x0027, PHI: r2
      0x00cc: PHI (r2v2 android.database.sqlite.SQLiteDatabase) = (r2v1 android.database.sqlite.SQLiteDatabase), (r2v3 android.database.sqlite.SQLiteDatabase) binds: [B:55:0x00ca, B:41:0x00ad] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0027, blocks: (B:9:0x0023, B:12:0x002b, B:14:0x002f, B:32:0x0099, B:34:0x00a0, B:52:0x00c3, B:53:0x00c6, B:56:0x00cc, B:60:0x00d3, B:61:0x00d6, B:64:0x00dc, B:65:0x00df, B:39:0x00a9, B:45:0x00b4, B:47:0x00ba), top: B:74:0x0002, inners: #4 }] */
    private synchronized List<y> c(int i7) {
        Throwable th;
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery;
        try {
            try {
                writableDatabase = f3514c.getWritableDatabase();
                if (writableDatabase == null) {
                    if (f3512a && writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return null;
                }
                try {
                    String strConcat = "_id = ".concat(String.valueOf(i7));
                    cursorQuery = writableDatabase.query("t_pf", null, strConcat, null, null, null, null);
                    if (cursorQuery == null) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (f3512a) {
                            writableDatabase.close();
                        }
                        return null;
                    }
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            y yVarB = b(cursorQuery);
                            if (yVarB != null) {
                                arrayList.add(yVarB);
                            } else {
                                try {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_tp"));
                                    sb2.append(" or _tp = ");
                                    sb2.append(string);
                                } catch (Throwable unused) {
                                    al.d("[Database] unknown id.", new Object[0]);
                                }
                            }
                        }
                        if (sb2.length() > 0) {
                            sb2.append(" and _id = ");
                            sb2.append(i7);
                            al.d("[Database] deleted %s illegal data %d.", "t_pf", Integer.valueOf(writableDatabase.delete("t_pf", strConcat.substring(4), null)));
                        }
                        cursorQuery.close();
                        if (f3512a) {
                            writableDatabase.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            if (!al.a(th)) {
                                th.printStackTrace();
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (f3512a && writableDatabase != null) {
                                writableDatabase.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (!f3512a || writableDatabase == null) {
                                throw th3;
                            }
                            writableDatabase.close();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursorQuery = null;
                }
            } catch (Throwable th5) {
                th = th5;
                writableDatabase = null;
                cursorQuery = null;
            }
        } catch (Throwable th6) {
            throw th6;
        }
    }

    private static ContentValues d(y yVar) {
        if (yVar != null && !ap.b(yVar.f3524f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j5 = yVar.f3519a;
                if (j5 > 0) {
                    contentValues.put("_id", Long.valueOf(j5));
                }
                contentValues.put("_tp", yVar.f3524f);
                contentValues.put("_tm", Long.valueOf(yVar.f3523e));
                byte[] bArr = yVar.f3525g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public final int a(String str, String str2) {
        return a(str, str2, (String[]) null, (v) null);
    }

    public final synchronized long a(String str, ContentValues contentValues, v vVar) {
        long j5;
        j5 = -1;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3514c.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long jReplace = writableDatabase.replace(str, "_id", contentValues);
                if (jReplace >= 0) {
                    al.c("[Database] insert %s success.", str);
                } else {
                    al.d("[Database] replace %s error.", str);
                }
                j5 = jReplace;
            }
            if (f3512a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th) {
            try {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
                if (f3512a && 0 != 0) {
                }
            } catch (Throwable th2) {
                if (f3512a && 0 != 0) {
                    writableDatabase.close();
                }
                throw th2;
            }
        }
        return j5;
    }

    public final Cursor a(String str, String[] strArr, String str2) {
        return a(str, strArr, str2, (String) null, (String) null);
    }

    public final Cursor a(String str, String[] strArr, String str2, String str3, String str4) {
        return a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #2 {all -> 0x00b6, blocks: (B:42:0x00ac, B:44:0x00b2), top: B:66:0x00ac, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:3:0x0001, B:14:0x002d, B:17:0x0035, B:19:0x0039, B:37:0x00a0, B:39:0x00a7, B:49:0x00bb, B:50:0x00be, B:52:0x00c2, B:54:0x00c8, B:55:0x00cb, B:57:0x00cf, B:58:0x00d2, B:42:0x00ac, B:44:0x00b2), top: B:65:0x0001, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:3:0x0001, B:14:0x002d, B:17:0x0035, B:19:0x0039, B:37:0x00a0, B:39:0x00a7, B:49:0x00bb, B:50:0x00be, B:52:0x00c2, B:54:0x00c8, B:55:0x00cb, B:57:0x00cf, B:58:0x00d2, B:42:0x00ac, B:44:0x00b2), top: B:65:0x0001, inners: #2 }] */
    public final synchronized List<y> a(int i7) {
        String strConcat;
        Throwable th;
        Cursor cursor;
        try {
            SQLiteDatabase writableDatabase = f3514c.getWritableDatabase();
            if (writableDatabase != null) {
                if (i7 >= 0) {
                    try {
                        strConcat = "_tp = ".concat(String.valueOf(i7));
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        try {
                            if (!al.a(th)) {
                                th.printStackTrace();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (f3512a) {
                                writableDatabase.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (!f3512a) {
                                throw th3;
                            }
                            writableDatabase.close();
                            throw th3;
                        }
                    }
                } else {
                    strConcat = null;
                }
                Cursor cursorQuery = writableDatabase.query("t_lr", null, strConcat, null, null, null, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (f3512a) {
                        writableDatabase.close();
                    }
                    return null;
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    while (cursorQuery.moveToNext()) {
                        y yVarA = a(cursorQuery);
                        if (yVarA != null) {
                            arrayList.add(yVarA);
                        } else {
                            try {
                                long j5 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                sb2.append(" or _id = ");
                                sb2.append(j5);
                            } catch (Throwable unused) {
                                al.d("[Database] unknown id.", new Object[0]);
                            }
                        }
                    }
                    String string = sb2.toString();
                    if (string.length() > 0) {
                        al.d("[Database] deleted %s illegal data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string.substring(4), null)));
                    }
                    cursorQuery.close();
                    if (f3512a) {
                        writableDatabase.close();
                    }
                    return arrayList;
                } catch (Throwable th4) {
                    cursor = cursorQuery;
                    th = th4;
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (f3512a) {
                        writableDatabase.close();
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final Map<String, byte[]> a(int i7, v vVar) {
        HashMap map = null;
        try {
            List<y> listC = c(i7);
            if (listC == null) {
                return null;
            }
            HashMap map2 = new HashMap();
            try {
                for (y yVar : listC) {
                    byte[] bArr = yVar.f3525g;
                    if (bArr != null) {
                        map2.put(yVar.f3524f, bArr);
                    }
                }
                return map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (!al.a(th)) {
            th.printStackTrace();
        }
        return map;
    }

    public final synchronized void a(List<y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f3514c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (y yVar : list) {
                            sb2.append(" or _id = ");
                            sb2.append(yVar.f3519a);
                        }
                        String string = sb2.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb2.setLength(0);
                        try {
                            al.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                            if (f3512a) {
                                writableDatabase.close();
                            }
                        } catch (Throwable th) {
                            try {
                                if (!al.a(th)) {
                                    th.printStackTrace();
                                }
                                if (f3512a) {
                                }
                            } finally {
                                if (f3512a) {
                                    writableDatabase.close();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(int i7, String str, byte[] bArr, boolean z10) {
        if (z10) {
            return a(i7, str, bArr, (v) null);
        }
        t0 t0Var = new t0(this);
        t0Var.f3502b = i7;
        t0Var.f3503c = str;
        t0Var.f3504d = bArr;
        ak.a().a(t0Var);
        return true;
    }

    public final synchronized boolean a(y yVar) {
        ContentValues contentValuesC;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3514c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesC = c(yVar)) == null) {
                if (f3512a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            }
            long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesC);
            if (jReplace < 0) {
                if (f3512a) {
                    writableDatabase.close();
                }
                return false;
            }
            al.c("[Database] insert %s success.", "t_lr");
            yVar.f3519a = jReplace;
            if (f3512a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
                return false;
            } finally {
                if (f3512a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    public final synchronized void b(int i7) {
        String strConcat;
        SQLiteDatabase writableDatabase = f3514c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i7 >= 0) {
                try {
                    strConcat = "_tp = ".concat(String.valueOf(i7));
                } catch (Throwable th) {
                    try {
                        if (!al.a(th)) {
                            th.printStackTrace();
                        }
                        if (f3512a) {
                            return;
                        }
                    } finally {
                        if (f3512a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                strConcat = null;
            }
            al.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", strConcat, null)));
            if (f3512a) {
                writableDatabase.close();
            }
        }
    }
}
