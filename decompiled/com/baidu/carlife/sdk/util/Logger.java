package com.baidu.carlife.sdk.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.g;
import i9.l;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import u8.p;
import zb.j;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00072\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010 \"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00100\u001a\u0004\b=\u00102\"\u0004\b>\u00104¨\u0006A"}, d2 = {"Lcom/baidu/carlife/sdk/util/Logger;", "", "Ljava/io/File;", "dir", "<init>", "(Ljava/io/File;)V", "obj", "", "transform", "(Ljava/lang/Object;)Ljava/lang/String;", "tag", "logLevel", "message", "", "syncWrite", "Lt8/z;", "persist", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "text", "write", "(Ljava/lang/String;)V", "file", "doCompressAndDeleteFilesIfNeeded", "resumeLatestLogFile", "()Ljava/io/File;", "", "e", "uncaughtException", "(Ljava/lang/Throwable;)V", "quit", "()V", "", "", "args", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "Ljava/io/File;", "Ljava/io/BufferedWriter;", "writer", "Ljava/io/BufferedWriter;", "currentFile", "Landroid/os/Handler;", "persistHandler", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "persistThread", "Landroid/os/HandlerThread;", "level", "I", "getLevel", "()I", "setLevel", "(I)V", "", "maxFileSize", "J", "getMaxFileSize", "()J", "setMaxFileSize", "(J)V", "maxFileCount", "getMaxFileCount", "setMaxFileCount", "Companion", "LogFileComparator", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_MAX_FILE_COUNT = 20;
    public static final long DEFAULT_MAX_FILE_SIZE = 5242880;
    public static final int MESSAGE_INIT = 1;
    public static final int MESSAGE_SEND = 0;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static Logger f0default;
    private File currentFile;
    private final File dir;
    private int level;
    private int maxFileCount;
    private long maxFileSize;
    private final Handler persistHandler;
    private final HandlerThread persistThread;
    private BufferedWriter writer;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\nJ/\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\nJ/\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\"¨\u0006("}, d2 = {"Lcom/baidu/carlife/sdk/util/Logger$Companion;", "", "<init>", "()V", "", "tag", "", "args", "Lt8/z;", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "d", "w", "e", "wtf", "", "uncaughtException", "(Ljava/lang/Throwable;)V", "", "value", "getLogLevel", "()I", "setLogLevel", "(I)V", "getLogLevel$annotations", "logLevel", "Lcom/baidu/carlife/sdk/util/Logger;", "default", "Lcom/baidu/carlife/sdk/util/Logger;", "getDefault", "()Lcom/baidu/carlife/sdk/util/Logger;", "setDefault", "(Lcom/baidu/carlife/sdk/util/Logger;)V", "DEFAULT_MAX_FILE_COUNT", "I", "", "DEFAULT_MAX_FILE_SIZE", "J", "MESSAGE_INIT", "MESSAGE_SEND", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public final void d(String tag, Object... args) {
            l.e(tag, "tag");
            l.e(args, "args");
            Logger logger = getDefault();
            if (logger != null) {
                logger.log(3, tag, Arrays.copyOf(args, args.length));
            }
        }

        public final void e(String tag, Object... args) {
            l.e(tag, "tag");
            l.e(args, "args");
            Logger logger = getDefault();
            if (logger != null) {
                logger.log(6, tag, Arrays.copyOf(args, args.length));
            }
        }

        public final Logger getDefault() {
            return Logger.f0default;
        }

        public final int getLogLevel() {
            Logger logger = getDefault();
            if (logger != null) {
                return logger.getLevel();
            }
            return 6;
        }

        public final void setDefault(Logger logger) {
            Logger.f0default = logger;
        }

        public final void setLogLevel(int i7) {
            Logger logger = getDefault();
            if (logger == null) {
                return;
            }
            logger.setLevel(i7);
        }

        public final void uncaughtException(Throwable e7) {
            l.e(e7, "e");
            Logger logger = getDefault();
            if (logger != null) {
                logger.uncaughtException(e7);
            }
        }

        public final void v(String tag, Object... args) {
            l.e(tag, "tag");
            l.e(args, "args");
            Logger logger = getDefault();
            if (logger != null) {
                logger.log(2, tag, Arrays.copyOf(args, args.length));
            }
        }

        public final void w(String tag, Object... args) {
            l.e(tag, "tag");
            l.e(args, "args");
            Logger logger = getDefault();
            if (logger != null) {
                logger.log(5, tag, Arrays.copyOf(args, args.length));
            }
        }

        public final void wtf(String tag, Object... args) {
            l.e(tag, "tag");
            l.e(args, "args");
            Logger logger = getDefault();
            if (logger != null) {
                logger.log(7, tag, Arrays.copyOf(args, args.length));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/baidu/carlife/sdk/util/Logger$LogFileComparator;", "Ljava/util/Comparator;", "Ljava/io/File;", "()V", "lastModifiedCache", "", "", "compare", "", "f1", "f2", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class LogFileComparator implements Comparator<File> {
        private final Map<File, Long> lastModifiedCache = new LinkedHashMap();

        @Override // java.util.Comparator
        public int compare(File f10, File f11) {
            long jLastModified;
            long jLongValue;
            l.e(f10, "f1");
            l.e(f11, "f2");
            Long l10 = this.lastModifiedCache.get(f10);
            if (l10 != null) {
                jLastModified = l10.longValue();
            } else {
                jLastModified = f10.lastModified();
                this.lastModifiedCache.put(f10, Long.valueOf(jLastModified));
            }
            Long l11 = this.lastModifiedCache.get(f11);
            if (l11 != null) {
                jLongValue = l11.longValue();
            } else {
                long jLastModified2 = f11.lastModified();
                this.lastModifiedCache.put(f11, Long.valueOf(jLastModified2));
                jLongValue = jLastModified2;
            }
            return (int) (jLastModified - jLongValue);
        }
    }

    public Logger(File file) {
        l.e(file, "dir");
        this.dir = file;
        HandlerThread handlerThread = new HandlerThread("CarLife_Logger");
        this.persistThread = handlerThread;
        this.level = 5;
        this.maxFileSize = DEFAULT_MAX_FILE_SIZE;
        this.maxFileCount = 20;
        if (!file.exists()) {
            file.mkdirs();
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), new a(1, this));
        this.persistHandler = handler;
        handler.sendMessage(Message.obtain(handler, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Logger logger, Message message) {
        File fileResumeLatestLogFile;
        l.e(message, "it");
        int i7 = message.what;
        if (i7 == 0) {
            Object obj = message.obj;
            l.c(obj, "null cannot be cast to non-null type kotlin.String");
            logger.write((String) obj);
        } else if (i7 == 1 && (fileResumeLatestLogFile = logger.resumeLatestLogFile()) != null) {
            logger.currentFile = fileResumeLatestLogFile;
            File file = logger.currentFile;
            l.b(file);
            logger.writer = new BufferedWriter(new FileWriter(file, true));
        }
        return true;
    }

    public static final void d(String str, Object... objArr) {
        INSTANCE.d(str, objArr);
    }

    private final void doCompressAndDeleteFilesIfNeeded(File file) {
        if (file != null) {
            IOUtilsKt.gzip(file);
            Log.d(Constants.TAG, "Logger compress new file " + file);
        }
        File[] fileArrListFiles = this.dir.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                l.d(name, "it.name");
                if (!q.o0(name, "crash")) {
                    arrayList.add(file2);
                }
            }
            List listE0 = p.E0(arrayList, new LogFileComparator());
            if (listE0.size() >= this.maxFileCount) {
                int size = (int) (((double) listE0.size()) * 0.2d);
                for (int i7 = 0; i7 < size; i7++) {
                    ((File) listE0.get(i7)).delete();
                    Log.d(Constants.TAG, "Logger delete file " + listE0.get(i7));
                }
            }
        }
    }

    public static final void e(String str, Object... objArr) {
        INSTANCE.e(str, objArr);
    }

    public static final int getLogLevel() {
        return INSTANCE.getLogLevel();
    }

    private final void persist(String tag, String logLevel, String message, boolean syncWrite) {
        String str = DatesKt.formatISO8601(new Date()) + ' ' + Process.myPid() + ' ' + Thread.currentThread().getId() + ' ' + logLevel + '/' + tag + ": " + message;
        if (syncWrite) {
            write(str);
        } else {
            Handler handler = this.persistHandler;
            handler.sendMessage(Message.obtain(handler, 0, str));
        }
    }

    public static /* synthetic */ void persist$default(Logger logger, String str, String str2, String str3, boolean z10, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z10 = false;
        }
        logger.persist(str, str2, str3, z10);
    }

    private final File resumeLatestLogFile() {
        File[] fileArrListFiles = this.dir.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            l.d(name, "fileName");
            if (!q.o0(name, "crash") && q.i0(name, ".log")) {
                arrayList.add(file);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (File) p.s0(arrayList);
    }

    public static final void setLogLevel(int i7) {
        INSTANCE.setLogLevel(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String transform(Object obj) {
        if (!(obj instanceof Exception)) {
            return String.valueOf(obj);
        }
        String stackTraceString = Log.getStackTraceString((Throwable) obj);
        l.d(stackTraceString, "{\n            Log.getSta…raceString(obj)\n        }");
        return stackTraceString;
    }

    public static final void v(String str, Object... objArr) {
        INSTANCE.v(str, objArr);
    }

    public static final void w(String str, Object... objArr) {
        INSTANCE.w(str, objArr);
    }

    private final synchronized void write(String text) {
        try {
            if (this.writer == null) {
                File file = new File(this.dir, DatesKt.formatISO8601(new Date()) + ".log");
                this.currentFile = file;
                if (!file.exists()) {
                    File file2 = this.currentFile;
                    l.b(file2);
                    file2.createNewFile();
                }
                File file3 = this.currentFile;
                l.b(file3);
                this.writer = new BufferedWriter(new FileWriter(file3, true));
            }
            try {
                BufferedWriter bufferedWriter = this.writer;
                if (bufferedWriter != null) {
                    bufferedWriter.write(text);
                    if (j.C0(text) != '\n') {
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.flush();
                }
            } catch (IOException e7) {
                Log.e("Logger", "写日志失败: " + e7.getMessage());
            }
            File file4 = this.currentFile;
            if (file4 != null) {
                l.b(file4);
                if (file4.length() > this.maxFileSize) {
                    try {
                        BufferedWriter bufferedWriter2 = this.writer;
                        if (bufferedWriter2 != null) {
                            bufferedWriter2.close();
                        }
                    } catch (Exception unused) {
                    }
                    File file5 = this.currentFile;
                    l.b(file5);
                    doCompressAndDeleteFilesIfNeeded(file5);
                    this.writer = null;
                    this.currentFile = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final void wtf(String str, Object... objArr) {
        INSTANCE.wtf(str, objArr);
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getMaxFileCount() {
        return this.maxFileCount;
    }

    public final long getMaxFileSize() {
        return this.maxFileSize;
    }

    public final void log(int logLevel, String tag, Object... args) {
        l.e(tag, "tag");
        l.e(args, "args");
        if (this.level <= logLevel) {
            String strTransform = args.length == 1 ? transform(args[0]) : u8.l.F0(args, "", null, null, new Logger$log$message$1(this), 30);
            if (logLevel == 2) {
                Log.v(tag, strTransform);
                persist$default(this, tag, "V", strTransform, false, 8, null);
                return;
            }
            if (logLevel == 3) {
                Log.d(tag, strTransform);
                persist$default(this, tag, "D", strTransform, false, 8, null);
                return;
            }
            if (logLevel == 5) {
                Log.w(tag, strTransform);
                persist$default(this, tag, "W", strTransform, false, 8, null);
            } else if (logLevel == 6) {
                Log.e(tag, strTransform);
                persist$default(this, tag, "E", strTransform, false, 8, null);
            } else {
                if (logLevel != 7) {
                    return;
                }
                Log.wtf(tag, strTransform);
                persist$default(this, tag, "E", strTransform, false, 8, null);
            }
        }
    }

    public final synchronized void quit() {
        this.persistThread.quitSafely();
        BufferedWriter bufferedWriter = this.writer;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
    }

    public final void setLevel(int i7) {
        this.level = i7;
    }

    public final void setMaxFileCount(int i7) {
        this.maxFileCount = i7;
    }

    public final void setMaxFileSize(long j5) {
        this.maxFileSize = j5;
    }

    public final void uncaughtException(Throwable e7) {
        l.e(e7, "e");
        try {
            FileWriter fileWriter = new FileWriter(new File(this.dir, "crash_" + DatesKt.formatISO8601(new Date()) + ".log"));
            try {
                fileWriter.write(Log.getStackTraceString(e7));
                fileWriter.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    g5.a.m(fileWriter, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Log.e(Constants.TAG, "uncaughtException exception: " + Log.getStackTraceString(th3));
        }
    }
}
