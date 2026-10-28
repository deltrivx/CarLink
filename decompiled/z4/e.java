package z4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import z.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4.e f15718a = new n4.e(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f15719b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f15720c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f15721d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f15722e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f15723f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f15724g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f15725h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f15726i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f15727j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int i7 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.f15715g * 2) + 7) & (-8)) / 8) + (aVar.f15713e * 2) + d(aVar.f15709a, aVar.f15710b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f15714f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f15723f)) {
            int length2 = aVarArr.length;
            while (i7 < length2) {
                a aVar2 = aVarArr[i7];
                q(byteArrayOutputStream, aVar2, d(aVar2.f15709a, aVar2.f15710b, bArr));
                p(byteArrayOutputStream, aVar2);
                i7++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(aVar3.f15709a, aVar3.f15710b, bArr));
            }
            int length3 = aVarArr.length;
            while (i7 < length3) {
                p(byteArrayOutputStream, aVarArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f15725h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f15724g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                return ob.a.s(sb2, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(int i7, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i7];
        int i10 = 0;
        while (i10 < i7) {
            int i11 = inputStream.read(bArr, i10, i7 - i10);
            if (i11 < 0) {
                throw new IllegalStateException(a2.f.E(i7, "Not enough bytes to read: "));
            }
            i10 += i11;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int iM = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            iM += (int) m(2, byteArrayInputStream);
            iArr[i10] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i7, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i7) {
                int i12 = fileInputStream.read(bArr2);
                if (i12 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            if (i11 == i7) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i11);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = f15726i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f15727j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(2, fileInputStream);
            byte[] bArrH = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f15721d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(1, fileInputStream);
        byte[] bArrH2 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i7, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i7 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int iM = (int) m(2, byteArrayInputStream);
            iArr[i10] = (int) m(2, byteArrayInputStream);
            strArr[i10] = new String(f(iM, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i7; i11++) {
            a aVar = aVarArr[i11];
            if (!aVar.f15710b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            aVar.f15713e = i12;
            aVar.f15716h = g(byteArrayInputStream, i12);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i7 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            m(2, byteArrayInputStream);
            String str = new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jM = m(4, byteArrayInputStream);
            int iM = (int) m(2, byteArrayInputStream);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i11 = 0; i11 < aVarArr.length; i11++) {
                    if (aVarArr[i11].f15710b.equals(strSubstring)) {
                        aVar = aVarArr[i11];
                        break;
                    }
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f15712d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f15725h)) {
                aVar.f15713e = iM;
                aVar.f15716h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f15722e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(1, fileInputStream);
        byte[] bArrH = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(int i7, InputStream inputStream) throws IOException {
        byte[] bArrF = f(i7, inputStream);
        long j5 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j5 += ((long) (bArrF[i10] & 255)) << (i10 * 8);
        }
        return j5;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int iM = (int) m(2, byteArrayInputStream);
            int iM2 = (int) m(2, byteArrayInputStream);
            aVarArr[i10] = new a(str, new String(f(iM, byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), iM2, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[iM2], new TreeMap());
        }
        int i11 = 0;
        while (i11 < i7) {
            a aVar = aVarArr[i11];
            int iAvailable = byteArrayInputStream.available();
            int i12 = aVar.f15714f;
            int i13 = aVar.f15715g;
            TreeMap treeMap = aVar.f15717i;
            int i14 = iAvailable - i12;
            int iM3 = 0;
            while (byteArrayInputStream.available() > i14) {
                iM3 += (int) m(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(2, byteArrayInputStream);
                while (iM4 > 0) {
                    m(2, byteArrayInputStream);
                    int iM5 = (int) m(1, byteArrayInputStream);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(1, byteArrayInputStream);
                            int i15 = i11;
                            for (int iM6 = (int) m(1, byteArrayInputStream); iM6 > 0; iM6--) {
                                m(2, byteArrayInputStream);
                            }
                            iM5--;
                            i11 = i15;
                        }
                    }
                    iM4--;
                    i11 = i11;
                }
            }
            int i16 = i11;
            if (byteArrayInputStream.available() != i14) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f15716h = g(byteArrayInputStream, aVar.f15713e);
            BitSet bitSetValueOf = BitSet.valueOf(f((((i13 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = bitSetValueOf.get(i17) ? 2 : 0;
                if (bitSetValueOf.get(i17 + i13)) {
                    i18 |= 4;
                }
                if (i18 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i17));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i17), Integer.valueOf(i18 | num.intValue()));
                }
            }
            i11 = i16 + 1;
        }
        return aVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f15721d;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f15722e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f15724g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f15717i.size() * 4;
                    String strD = d(aVar.f15709a, aVar.f15710b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f15716h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f15711c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.f15717i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i7 : aVar.f15716h) {
                        v(byteArrayOutputStream, i7);
                    }
                }
                return true;
            }
            byte[] bArr5 = f15723f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f15725h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f15709a;
                TreeMap treeMap = aVar2.f15717i;
                String strD2 = d(str, aVar2.f15710b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f15716h.length);
                u(byteArrayOutputStream, aVar2.f15711c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i10 : aVar2.f15716h) {
                    v(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i11 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f15711c, 4);
                u(byteArrayOutputStream2, aVar3.f15712d, 4);
                u(byteArrayOutputStream2, aVar3.f15715g, 4);
                String strD3 = d(aVar3.f15709a, aVar3.f15710b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                try {
                    a aVar4 = aVarArr[i13];
                    v(byteArrayOutputStream3, i13);
                    v(byteArrayOutputStream3, aVar4.f15713e);
                    i12 = i12 + 4 + (aVar4.f15713e * 2);
                    int[] iArr = aVar4.f15716h;
                    int length3 = iArr.length;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length3) {
                        int i16 = iArr[i14];
                        v(byteArrayOutputStream3, i16 - i15);
                        i14++;
                        i15 = i16;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i17];
                    Iterator it3 = aVar5.f15717i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i17);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i19 = i18 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i18 = i19 + length4;
                            i17++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i18 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(iVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i20);
                int i21 = iVar4.f15735a;
                byte[] bArr7 = iVar4.f15736b;
                if (i21 == 1) {
                    j5 = 0;
                } else if (i21 == 2) {
                    j5 = 1;
                } else if (i21 == 3) {
                    j5 = 2;
                } else if (i21 == 4) {
                    j5 = 3;
                } else {
                    if (i21 != 5) {
                        throw null;
                    }
                    j5 = 4;
                }
                u(byteArrayOutputStream, j5, 4);
                u(byteArrayOutputStream, size2, 4);
                if (iVar4.f15737c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        s(byteArrayOutputStream, aVar);
        int i7 = aVar.f15715g;
        int[] iArr = aVar.f15716h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i7 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f15717i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i13 = iIntValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i14 = iIntValue + i7;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f15713e);
        u(byteArrayOutputStream, aVar.f15714f, 4);
        u(byteArrayOutputStream, aVar.f15711c, 4);
        u(byteArrayOutputStream, aVar.f15715g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i7, a aVar) throws IOException {
        int i10 = aVar.f15715g;
        byte[] bArr = new byte[(((Integer.bitCount(i7 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f15717i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i7) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (i11 * i10) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i7 = 0;
        for (Map.Entry entry : aVar.f15717i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i7);
                v(byteArrayOutputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0199 A[Catch: all -> 0x0196, TRY_ENTER, TryCatch #35 {all -> 0x0196, blocks: (B:97:0x0174, B:99:0x0180, B:110:0x0199, B:111:0x019e), top: B:290:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa A[Catch: IllegalStateException -> 0x018f, IOException -> 0x0191, FileNotFoundException -> 0x0194, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0194, IOException -> 0x0191, IllegalStateException -> 0x018f, blocks: (B:95:0x016c, B:100:0x018a, B:118:0x01aa, B:116:0x01a7, B:115:0x01a4), top: B:301:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ea A[Catch: all -> 0x01f9, TRY_LEAVE, TryCatch #18 {all -> 0x01f9, blocks: (B:133:0x01de, B:135:0x01ea, B:144:0x01fc), top: B:274:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fc A[Catch: all -> 0x01f9, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x01f9, blocks: (B:133:0x01de, B:135:0x01ea, B:144:0x01fc), top: B:274:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0219  */
    /* JADX WARN: Code duplicated, block: B:159:0x0225  */
    /* JADX WARN: Code duplicated, block: B:160:0x0229  */
    /* JADX WARN: Code duplicated, block: B:169:0x024b A[Catch: all -> 0x028a, TryCatch #30 {all -> 0x028a, blocks: (B:167:0x0245, B:169:0x024b, B:170:0x024f, B:172:0x0255), top: B:282:0x0245 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0255 A[Catch: all -> 0x028a, TRY_LEAVE, TryCatch #30 {all -> 0x028a, blocks: (B:167:0x0245, B:169:0x024b, B:170:0x024f, B:172:0x0255), top: B:282:0x0245 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x02db  */
    /* JADX WARN: Code duplicated, block: B:242:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:249:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:264:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x025a A[EDGE_INSN: B:302:0x025a->B:174:0x025a BREAK  A[LOOP:0: B:170:0x024f->B:303:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[Catch: all -> 0x0128, IllegalStateException -> 0x012b, IOException -> 0x012d, TRY_LEAVE, TryCatch #9 {IOException -> 0x012d, blocks: (B:54:0x0109, B:56:0x0113, B:67:0x012f, B:68:0x0134), top: B:264:0x0109, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012f A[Catch: all -> 0x0128, IllegalStateException -> 0x012b, IOException -> 0x012d, TRY_ENTER, TryCatch #9 {IOException -> 0x012d, blocks: (B:54:0x0109, B:56:0x0113, B:67:0x012f, B:68:0x0134), top: B:264:0x0109, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0180 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #35 {all -> 0x0196, blocks: (B:97:0x0174, B:99:0x0180, B:110:0x0199, B:111:0x019e), top: B:290:0x0174 }] */
    public static void t(Context context, Executor executor, d dVar, boolean z10) {
        FileInputStream fileInputStreamD;
        byte[] bArr;
        a[] aVarArrL;
        a[] aVarArr;
        d dVar2;
        a[] aVarArr2;
        byte[] bArr2;
        byte[] bArr3;
        boolean z11;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i7;
        boolean z12;
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        w0 w0Var;
        FileInputStream fileInputStreamD2;
        boolean z13;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j5 = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = j5 == packageInfo.lastUpdateTime;
                            if (z14) {
                                dVar.e(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    h.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            w0 w0Var2 = new w0(assets, executor, dVar, name, file2);
            byte[] bArr5 = (byte[]) w0Var2.f15575d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            w0Var2.f15572a = true;
                            fileInputStreamD = w0Var2.d(assets, "dexopt/baseline.prof");
                            bArr = f15719b;
                            if (fileInputStreamD != null) {
                                if (Arrays.equals(bArr, f(4, fileInputStreamD))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                aVarArrL = l(fileInputStreamD, f(4, fileInputStreamD), (String) w0Var2.f15577f);
                                fileInputStreamD.close();
                                w0Var2.f15578g = aVarArrL;
                            }
                            aVarArr = (a[]) w0Var2.f15578g;
                            if (aVarArr != null) {
                                fileInputStreamD2 = w0Var2.d(assets, "dexopt/baseline.profm");
                                if (fileInputStreamD2 == null) {
                                    if (fileInputStreamD2 != null) {
                                        fileInputStreamD2.close();
                                    }
                                    w0Var = null;
                                } else {
                                    if (Arrays.equals(f15720c, f(4, fileInputStreamD2))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    w0Var2.f15578g = i(fileInputStreamD2, f(4, fileInputStreamD2), bArr5, aVarArr);
                                    fileInputStreamD2.close();
                                    w0Var = w0Var2;
                                }
                                if (w0Var != null) {
                                    w0Var2 = w0Var;
                                }
                            }
                            dVar2 = (d) w0Var2.f15574c;
                            aVarArr2 = (a[]) w0Var2.f15578g;
                            bArr2 = (byte[]) w0Var2.f15575d;
                            if (aVarArr2 != null) {
                                if (w0Var2.f15572a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                    w0Var2.f15579h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    w0Var2.f15578g = null;
                                } else {
                                    dVar2.e(5, null);
                                    w0Var2.f15578g = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr3 = (byte[]) w0Var2.f15579h;
                            if (bArr3 != null) {
                                if (w0Var2.f15572a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) w0Var2.f15576e);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i7 = byteArrayInputStream.read(bArr4);
                                            if (i7 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i7);
                                        }
                                        w0Var2.e(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        w0Var2.f15579h = null;
                                        w0Var2.f15578g = null;
                                        z11 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z11 = false;
                            if (z11) {
                                e(packageInfo, filesDir);
                            }
                            z12 = z11;
                        } else {
                            w0Var2.e(4, null);
                        }
                    } catch (IOException unused2) {
                        w0Var2.e(4, null);
                    }
                } else if (file2.canWrite()) {
                    w0Var2.f15572a = true;
                    try {
                        fileInputStreamD = w0Var2.d(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e7) {
                        dVar.e(6, e7);
                        fileInputStreamD = null;
                    } catch (IOException e10) {
                        dVar.e(7, e10);
                        fileInputStreamD = null;
                    }
                    bArr = f15719b;
                    try {
                        if (fileInputStreamD != null) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, f(4, fileInputStreamD))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    aVarArrL = l(fileInputStreamD, f(4, fileInputStreamD), (String) w0Var2.f15577f);
                                    try {
                                        fileInputStreamD.close();
                                    } catch (IOException e11) {
                                        dVar.e(7, e11);
                                    }
                                    w0Var2.f15578g = aVarArrL;
                                } catch (IOException e12) {
                                    dVar.e(7, e12);
                                    try {
                                        fileInputStreamD.close();
                                    } catch (IOException e13) {
                                        dVar.e(7, e13);
                                    }
                                    aVarArrL = null;
                                }
                            } catch (IllegalStateException e14) {
                                dVar.e(8, e14);
                                fileInputStreamD.close();
                                aVarArrL = null;
                            }
                        }
                        aVarArr = (a[]) w0Var2.f15578g;
                        if (aVarArr != null && (i10 = Build.VERSION.SDK_INT) >= 24 && (i10 >= 31 || i10 == 24 || i10 == 25)) {
                            try {
                                fileInputStreamD2 = w0Var2.d(assets, "dexopt/baseline.profm");
                                if (fileInputStreamD2 == null) {
                                    try {
                                        if (Arrays.equals(f15720c, f(4, fileInputStreamD2))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        w0Var2.f15578g = i(fileInputStreamD2, f(4, fileInputStreamD2), bArr5, aVarArr);
                                        fileInputStreamD2.close();
                                        w0Var = w0Var2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamD2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamD2 != null) {
                                        fileInputStreamD2.close();
                                    }
                                    w0Var = null;
                                }
                            } catch (FileNotFoundException e15) {
                                dVar.e(9, e15);
                            } catch (IOException e16) {
                                dVar.e(7, e16);
                            } catch (IllegalStateException e17) {
                                w0Var2.f15578g = null;
                                dVar.e(8, e17);
                            }
                            if (w0Var != null) {
                                w0Var2 = w0Var;
                            }
                        }
                        dVar2 = (d) w0Var2.f15574c;
                        aVarArr2 = (a[]) w0Var2.f15578g;
                        bArr2 = (byte[]) w0Var2.f15575d;
                        if (aVarArr2 != null && bArr2 != null) {
                            if (w0Var2.f15572a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                        dVar2.e(5, null);
                                        w0Var2.f15578g = null;
                                        byteArrayOutputStream.close();
                                    } else {
                                        w0Var2.f15579h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        w0Var2.f15578g = null;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e18) {
                                dVar2.e(7, e18);
                            } catch (IllegalStateException e19) {
                                dVar2.e(8, e19);
                            }
                        }
                        bArr3 = (byte[]) w0Var2.f15579h;
                        if (bArr3 != null) {
                            z11 = false;
                        } else {
                            try {
                                if (w0Var2.f15572a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) w0Var2.f15576e);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i7 = byteArrayInputStream.read(bArr4);
                                                                                    if (i7 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i7);
                                                                                    }
                                                                                }
                                                                                w0Var2.e(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                w0Var2.f15579h = null;
                                                                                w0Var2.f15578g = null;
                                                                                z11 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e20) {
                                        e = e20;
                                        w0Var2.e(6, e);
                                        w0Var2.f15579h = null;
                                        w0Var2.f15578g = null;
                                        z11 = false;
                                    } catch (IOException e21) {
                                        e = e21;
                                        w0Var2.e(7, e);
                                        w0Var2.f15579h = null;
                                        w0Var2.f15578g = null;
                                        z11 = false;
                                    }
                                } catch (FileNotFoundException e22) {
                                    e = e22;
                                    w0Var2.e(6, e);
                                    w0Var2.f15579h = null;
                                    w0Var2.f15578g = null;
                                    z11 = false;
                                } catch (IOException e23) {
                                    e = e23;
                                    w0Var2.e(7, e);
                                    w0Var2.f15579h = null;
                                    w0Var2.f15578g = null;
                                    z11 = false;
                                }
                            } catch (Throwable th23) {
                                w0Var2.f15579h = null;
                                w0Var2.f15578g = null;
                                throw th23;
                            }
                        }
                        if (z11) {
                            e(packageInfo, filesDir);
                        }
                        z12 = z11;
                    } catch (Throwable th24) {
                        try {
                            fileInputStreamD.close();
                            throw th24;
                        } catch (IOException e24) {
                            dVar.e(7, e24);
                            throw th24;
                        }
                    }
                } else {
                    w0Var2.e(4, null);
                }
                if (z12 || !z10) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                h.c(context, z13);
            }
            w0Var2.e(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z12 = false;
            if (z12) {
                z13 = false;
            } else {
                z13 = false;
            }
            h.c(context, z13);
        } catch (PackageManager.NameNotFoundException e25) {
            dVar.e(7, e25);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j5, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) ((j5 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i7) throws IOException {
        u(byteArrayOutputStream, i7, 2);
    }
}
