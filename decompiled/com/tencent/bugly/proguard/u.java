package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3506a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static u f3507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f3508c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SharedPreferences f3511f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Integer, Map<String, t>> f3510e = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f3509d = aa.b().f3054d;

    private u(Context context) {
        this.f3508c = context;
        this.f3511f = context.getSharedPreferences("crashrecord", 0);
    }

    public static synchronized u a() {
        return f3507b;
    }

    public static synchronized u a(Context context) {
        try {
            if (f3507b == null) {
                f3507b = new u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3507b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x004c A[Catch: all -> 0x002a, Exception -> 0x0050, TRY_ENTER, TryCatch #1 {Exception -> 0x0050, blocks: (B:7:0x0006, B:11:0x0025, B:32:0x004c, B:33:0x004f, B:26:0x0043), top: B:39:0x0006, outer: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public synchronized <T extends List<?>> void a(int i7, T t2) {
        Throwable th;
        ObjectOutputStream objectOutputStream;
        IOException e7;
        if (t2 == null) {
            return;
        }
        try {
            ObjectOutputStream dir = this.f3508c.getDir("crashrecord", 0);
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File((File) dir, String.valueOf(i7))));
                    try {
                        objectOutputStream.writeObject(t2);
                        objectOutputStream.close();
                    } catch (IOException e10) {
                        e7 = e10;
                        e7.printStackTrace();
                        al.a("open record file error", new Object[0]);
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (dir != 0) {
                        dir.close();
                    }
                    throw th;
                }
            } catch (IOException e11) {
                objectOutputStream = null;
                e7 = e11;
            } catch (Throwable th3) {
                dir = 0;
                th = th3;
                if (dir != 0) {
                    dir.close();
                }
                throw th;
            }
        } catch (Exception unused) {
            al.e("writeCrashRecord error", new Object[0]);
        }
    }

    public static /* synthetic */ boolean a(t tVar, t tVar2) {
        String str;
        return tVar.f3500g == tVar2.f3500g && (str = tVar.f3495b) != null && str.equalsIgnoreCase(tVar2.f3495b);
    }

    public static /* synthetic */ boolean b(t tVar, t tVar2) {
        String str = tVar.f3498e;
        if (str != null && !str.equalsIgnoreCase(tVar2.f3498e)) {
            return true;
        }
        String str2 = tVar.f3499f;
        return !(str2 == null || str2.equalsIgnoreCase(tVar2.f3499f)) || tVar.f3497d <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean c(int i7) {
        try {
            try {
                List<t> listD = d(i7);
                if (listD == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (t tVar : listD) {
                    String str = tVar.f3495b;
                    if (str != null && str.equalsIgnoreCase(this.f3509d) && tVar.f3497d > 0) {
                        arrayList.add(tVar);
                    }
                    if (tVar.f3496c + 86400000 < jCurrentTimeMillis) {
                        arrayList2.add(tVar);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() < 2) {
                    listD.removeAll(arrayList2);
                    a(i7, listD);
                    return false;
                }
                if (arrayList.size() <= 0 || ((t) arrayList.get(arrayList.size() - 1)).f3496c + 86400000 >= jCurrentTimeMillis) {
                    return true;
                }
                listD.clear();
                a(i7, listD);
                return false;
            } catch (Exception unused) {
                al.e("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[Catch: all -> 0x0031, Exception -> 0x0057, PHI: r6
      0x0042: PHI (r6v10 java.io.ObjectInputStream) = (r6v9 java.io.ObjectInputStream), (r6v11 java.io.ObjectInputStream) binds: [B:21:0x0040, B:26:0x004e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0057, blocks: (B:4:0x0003, B:10:0x002c, B:29:0x0053, B:30:0x0056, B:22:0x0042), top: B:38:0x0003, outer: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public synchronized <T extends List<?>> T d(int i7) {
        ObjectInputStream objectInputStream;
        try {
            File file = new File(this.f3508c.getDir("crashrecord", 0), String.valueOf(i7));
            ObjectInputStream objectInputStreamExists = file.exists();
            try {
                if (objectInputStreamExists == 0) {
                    return null;
                }
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        T t2 = (T) objectInputStream.readObject();
                        objectInputStream.close();
                        return t2;
                    } catch (IOException unused) {
                        al.a("open record file error", new Object[0]);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (ClassNotFoundException unused2) {
                        al.a("get object error", new Object[0]);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    }
                } catch (IOException unused3) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused4) {
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    objectInputStreamExists = 0;
                    if (objectInputStreamExists != 0) {
                        objectInputStreamExists.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused5) {
            al.e("readCrashRecord error", new Object[0]);
        }
    }

    public final void a(int i7) {
        ak.a().a(new s0(this, i7, 0));
    }

    public final synchronized boolean b(int i7) {
        boolean z10;
        z10 = true;
        try {
            z10 = this.f3511f.getBoolean(i7 + "_" + this.f3509d, true);
            ak.a().a(new s0(this, i7, 1));
        } catch (Exception unused) {
            al.e("canInit error", new Object[0]);
            return z10;
        }
        return z10;
    }
}
