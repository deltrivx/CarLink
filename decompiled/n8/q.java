package n8;

import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import fc.h0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s8.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h0 f8931l = fc.y.b("");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8934j;
    public final File k;

    public q(String str, String str2) {
        this.f12646c = new s8.d();
        this.f8932h = str;
        this.f8933i = str2;
        this.k = new File(a.b().getExternalFilesDir(null), str);
    }

    public static void h(String str, h9.a aVar) {
        i9.l.e(str, "path");
        File file = new File(str);
        if (!file.exists()) {
            Logger.INSTANCE.e(Constants.TAG, "【传输服务】文件不存在: ".concat(str));
        } else if (!file.delete()) {
            Logger.INSTANCE.e(Constants.TAG, ob.a.q("【传输服务】删除失败: ", file.getAbsolutePath()));
        } else {
            aVar.invoke();
            Logger.INSTANCE.e(Constants.TAG, "【传输服务】文件已删除: ".concat(str));
        }
    }

    public static String j() {
        t8.o oVar = h.f8903a;
        return a2.f.G("http://", h.a(), ":18080");
    }

    @Override // s8.l
    public final s8.j e(s8.f fVar) throws IOException {
        String str;
        int length;
        int iZ0;
        int i7 = fVar.f12615g;
        s8.i iVar = s8.i.f12623d;
        s8.i iVar2 = s8.i.f12622c;
        String str2 = this.f8932h;
        if (i7 == 1 && i9.l.a(fVar.f12614f, "/download")) {
            List list = (List) fVar.f12616h.get("file");
            String str3 = list != null ? (String) u8.p.m0(list) : null;
            if (str3 == null) {
                return s8.l.c(iVar, "text/plain", "缺少 file 参数");
            }
            File file = new File(a.b().getExternalFilesDir(null), str2 + "/" + str3);
            if (!file.exists()) {
                return s8.l.c(iVar, "text/plain", "文件不存在");
            }
            s8.j jVar = new s8.j(iVar2, "application/octet-stream", new FileInputStream(file), -1L);
            jVar.f12633e.put("Content-Disposition", a2.f.G("attachment; filename=\"", str3, "\""));
            return jVar;
        }
        int i10 = fVar.f12615g;
        if (i10 == 1) {
            if (!i9.l.a(str2, "log")) {
                InputStream inputStreamOpen = a.b().getAssets().open("upload.html");
                i9.l.d(inputStreamOpen, "open(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, zb.a.f15804a), ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
                try {
                    String strR = i2.c.R(bufferedReader);
                    bufferedReader.close();
                    return s8.l.c(iVar2, "text/html", zb.q.n0(strR, "<!--扩展名-->", this.f8933i));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        g5.a.m(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            InputStream inputStreamOpen2 = a.b().getAssets().open("download.html");
            i9.l.d(inputStreamOpen2, "open(...)");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen2, zb.a.f15804a), ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
            try {
                String strR2 = i2.c.R(bufferedReader2);
                bufferedReader2.close();
                File[] fileArrI = i();
                if (fileArrI.length != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (File file2 : fileArrI) {
                        String name = file2.getName();
                        sb2.append("<li><a href=\"/download?file=" + name + "\">" + name + "</a></li>");
                    }
                    String string = sb2.toString();
                    i9.l.d(string, "toString(...)");
                    strR2 = zb.q.n0(strR2, "<li><a>暂无文件</a></li>", string);
                }
                return s8.l.c(iVar2, "text/html", strR2);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    g5.a.m(bufferedReader2, th3);
                    throw th4;
                }
            }
        }
        if (i10 != 3) {
            return s8.l.c(s8.i.f12624e, "text/plain", "Unsupported method");
        }
        HashMap map = new HashMap();
        try {
            fVar.g(map);
            String str4 = (String) map.get("file");
            List list2 = (List) fVar.f12616h.get("file");
            if (list2 == null || (str = (String) u8.p.m0(list2)) == null) {
                str = "fileName.bin";
            }
            String strN0 = zb.j.N0(str, '.', "bin");
            if (str4 == null) {
                return s8.l.c(iVar, "text/plain", "上传失败：未找到文件");
            }
            String str5 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + "." + strN0;
            File file3 = new File(a.b().getExternalFilesDir(null), str2);
            file3.mkdirs();
            i9.l.e(str5, "relative");
            File file4 = new File(str5);
            String path = file4.getPath();
            i9.l.d(path, "getPath(...)");
            char c10 = File.separatorChar;
            int iZ1 = zb.j.z0(path, c10, 0, 4);
            if (iZ1 == 0) {
                if (path.length() <= 1 || path.charAt(1) != c10 || (iZ0 = zb.j.z0(path, c10, 2, 4)) < 0) {
                    length = 1;
                } else {
                    int iZ2 = zb.j.z0(path, c10, iZ0 + 1, 4);
                    length = iZ2 >= 0 ? iZ2 + 1 : path.length();
                }
            } else if (iZ1 <= 0 || path.charAt(iZ1 - 1) != ':') {
                length = (iZ1 == -1 && zb.j.u0(':', path)) ? path.length() : 0;
            } else {
                length = iZ1 + 1;
            }
            if (!(length > 0)) {
                String string2 = file3.toString();
                i9.l.d(string2, "toString(...)");
                file4 = ((string2.length() == 0) || zb.j.u0(c10, string2)) ? new File(string2 + file4) : new File(string2 + c10 + file4);
            }
            File file5 = new File(str4);
            if (!file5.exists()) {
                throw new f9.a(file5, null, "The source file doesn't exist.");
            }
            if (file4.exists() && !file4.delete()) {
                throw new f9.a(file5, file4, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (!file5.isDirectory()) {
                File parentFile = file4.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file5);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                    try {
                        a.a.u(fileInputStream, fileOutputStream);
                        fileOutputStream.close();
                        fileInputStream.close();
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            g5.a.m(fileOutputStream, th5);
                            throw th6;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        g5.a.m(fileInputStream, th7);
                        throw th8;
                    }
                }
            } else if (!file4.mkdirs()) {
                throw new com.google.protobuf.s(file5, file4, "Failed to create target directory.");
            }
            h0 h0Var = f8931l;
            h0Var.getClass();
            h0Var.j(null, str5);
            return s8.l.c(iVar2, "text/plain", "已上传 ".concat(str5));
        } catch (IOException e7) {
            return s8.l.c(iVar, "text/plain", "IO Error: " + e7.getMessage());
        } catch (s8.k e10) {
            return s8.l.c(iVar, "text/plain", "Response Error: " + e10.getMessage());
        }
    }

    public final File[] i() {
        File file = this.k;
        if (!file.exists()) {
            file.mkdirs();
        }
        if (i9.l.a(this.f8932h, "log")) {
            File[] fileArrListFiles = file.listFiles();
            return fileArrListFiles == null ? new File[0] : (File[]) u8.p.F0(5, u8.l.K0(fileArrListFiles, new p())).toArray(new File[0]);
        }
        File[] fileArrListFiles2 = file.listFiles();
        return fileArrListFiles2 == null ? new File[0] : fileArrListFiles2;
    }

    public final void k() {
        if (this.f8934j) {
            return;
        }
        try {
            f();
            this.f8934j = true;
            Logger.INSTANCE.d("CarLife_Vehicle", "【传输服务】" + j());
        } catch (IOException e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", ob.a.q("【传输服务】服务器启动失败: ", e7.getMessage()));
        }
    }

    public final void l() {
        if (this.f8934j) {
            try {
                s8.l.d(this.f12644a);
                s8.d dVar = this.f12646c;
                dVar.getClass();
                for (s8.a aVar : new ArrayList((List) dVar.f12606b)) {
                    s8.l.d(aVar.f12593a);
                    s8.l.d(aVar.f12594b);
                }
                Thread thread = this.f12645b;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e7) {
                s8.l.f12643g.log(Level.SEVERE, "Could not stop all connections", (Throwable) e7);
            }
            this.f8934j = false;
            Logger.INSTANCE.d("CarLife_Vehicle", "【传输服务】服务器已停止");
        }
    }
}
