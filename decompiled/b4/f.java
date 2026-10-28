package b4;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o9.e0;
import s.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f1481a = new s(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1482b = new c(0);

    public static l a(Context context, List list) {
        e0.m("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                g gVar = (g) list.get(i7);
                ProviderInfo providerInfoB = b(context.getPackageManager(), gVar, context.getResources());
                if (providerInfoB == null) {
                    return new l();
                }
                arrayList.add(c(context, gVar, providerInfoB.authority));
            }
            return new l(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, g gVar, Resources resources) {
        c cVar = f1482b;
        s sVar = f1481a;
        e0.m("FontProvider.getProvider");
        try {
            List listI = gVar.f1486d;
            String str = gVar.f1483a;
            String str2 = gVar.f1484b;
            if (listI == null) {
                listI = w3.b.i(resources, 0);
            }
            e eVar = new e();
            eVar.f1478a = str;
            eVar.f1479b = str2;
            eVar.f1480c = listI;
            ProviderInfo providerInfo = (ProviderInfo) sVar.a(eVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, cVar);
            for (int i7 = 0; i7 < listI.size(); i7++) {
                ArrayList arrayList2 = new ArrayList((Collection) listI.get(i7));
                Collections.sort(arrayList2, cVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            sVar.b(eVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:8:0x004c, B:32:0x00a1, B:34:0x00a6, B:36:0x00ac, B:37:0x00d5, B:41:0x00de, B:46:0x00eb, B:49:0x00f4, B:53:0x010a, B:56:0x0113, B:60:0x011f, B:51:0x00ff, B:69:0x013f, B:70:0x0142, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:17:0x007a, B:20:0x0080, B:22:0x0089, B:27:0x0093, B:30:0x0099), top: B:78:0x004c, outer: #3, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:8:0x004c, B:32:0x00a1, B:34:0x00a6, B:36:0x00ac, B:37:0x00d5, B:41:0x00de, B:46:0x00eb, B:49:0x00f4, B:53:0x010a, B:56:0x0113, B:60:0x011f, B:51:0x00ff, B:69:0x013f, B:70:0x0142, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:17:0x007a, B:20:0x0080, B:22:0x0089, B:27:0x0093, B:30:0x0099), top: B:78:0x004c, outer: #3, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:8:0x004c, B:32:0x00a1, B:34:0x00a6, B:36:0x00ac, B:37:0x00d5, B:41:0x00de, B:46:0x00eb, B:49:0x00f4, B:53:0x010a, B:56:0x0113, B:60:0x011f, B:51:0x00ff, B:69:0x013f, B:70:0x0142, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:17:0x007a, B:20:0x0080, B:22:0x0089, B:27:0x0093, B:30:0x0099), top: B:78:0x004c, outer: #3, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:8:0x004c, B:32:0x00a1, B:34:0x00a6, B:36:0x00ac, B:37:0x00d5, B:41:0x00de, B:46:0x00eb, B:49:0x00f4, B:53:0x010a, B:56:0x0113, B:60:0x011f, B:51:0x00ff, B:69:0x013f, B:70:0x0142, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:17:0x007a, B:20:0x0080, B:22:0x0089, B:27:0x0093, B:30:0x0099), top: B:78:0x004c, outer: #3, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010a A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:8:0x004c, B:32:0x00a1, B:34:0x00a6, B:36:0x00ac, B:37:0x00d5, B:41:0x00de, B:46:0x00eb, B:49:0x00f4, B:53:0x010a, B:56:0x0113, B:60:0x011f, B:51:0x00ff, B:69:0x013f, B:70:0x0142, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:17:0x007a, B:20:0x0080, B:22:0x0089, B:27:0x0093, B:30:0x0099), top: B:78:0x004c, outer: #3, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000b, B:5:0x003e, B:64:0x012b, B:65:0x012e, B:72:0x0145, B:73:0x0148, B:74:0x014b, B:6:0x0045, B:8:0x004c, B:32:0x00a1, B:34:0x00a6, B:36:0x00ac, B:37:0x00d5, B:41:0x00de, B:46:0x00eb, B:49:0x00f4, B:53:0x010a, B:56:0x0113, B:60:0x011f, B:51:0x00ff, B:69:0x013f, B:70:0x0142, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:17:0x007a, B:20:0x0080, B:22:0x0089, B:27:0x0093, B:30:0x0099), top: B:83:0x000b, inners: #0 }] */
    public static m[] c(Context context, g gVar, String str) {
        Cursor cursorQuery;
        Cursor cursor;
        int columnIndex;
        ArrayList arrayList;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int i7;
        int i10;
        Uri uriWithAppendedId;
        int i11;
        boolean z10;
        e0.m("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            d dVar = Build.VERSION.SDK_INT < 24 ? new d(context, uriBuild, 0) : new d(context, uriBuild, 1);
            Cursor cursor2 = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                e0.m("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {gVar.f1485c};
                    switch (dVar.f1476a) {
                        case 0:
                            ContentProviderClient contentProviderClient = dVar.f1477b;
                            cursorQuery = null;
                            if (contentProviderClient != null) {
                                try {
                                    cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e7) {
                                    Log.w("FontsProvider", "Unable to query the content provider", e7);
                                }
                                break;
                            }
                            cursor = cursorQuery;
                            Trace.endSection();
                            if (cursor != null && cursor.getCount() > 0) {
                                columnIndex = cursor.getColumnIndex("result_code");
                                arrayList = new ArrayList();
                                columnIndex2 = cursor.getColumnIndex("_id");
                                columnIndex3 = cursor.getColumnIndex("file_id");
                                columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                columnIndex5 = cursor.getColumnIndex("font_weight");
                                columnIndex6 = cursor.getColumnIndex("font_italic");
                                while (cursor.moveToNext()) {
                                    if (columnIndex != -1) {
                                        i7 = cursor.getInt(columnIndex);
                                    } else {
                                        i7 = 0;
                                    }
                                    if (columnIndex4 != -1) {
                                        i10 = cursor.getInt(columnIndex4);
                                    } else {
                                        i10 = 0;
                                    }
                                    if (columnIndex3 == -1) {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                                    } else {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                                    }
                                    Uri uri = uriWithAppendedId;
                                    if (columnIndex5 != -1) {
                                        i11 = cursor.getInt(columnIndex5);
                                    } else {
                                        i11 = 400;
                                    }
                                    if (columnIndex6 == -1 && cursor.getInt(columnIndex6) == 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    arrayList.add(new m(uri, i10, i11, z10, i7));
                                }
                                arrayList2 = arrayList;
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            dVar.a();
                            m[] mVarArr = (m[]) arrayList2.toArray(new m[0]);
                            Trace.endSection();
                            return mVarArr;
                        default:
                            ContentProviderClient contentProviderClient2 = dVar.f1477b;
                            cursorQuery = null;
                            if (contentProviderClient2 != null) {
                                try {
                                    cursorQuery = contentProviderClient2.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e10) {
                                    Log.w("FontsProvider", "Unable to query the content provider", e10);
                                }
                                break;
                            }
                            cursor = cursorQuery;
                            Trace.endSection();
                            if (cursor != null) {
                                columnIndex = cursor.getColumnIndex("result_code");
                                arrayList = new ArrayList();
                                columnIndex2 = cursor.getColumnIndex("_id");
                                columnIndex3 = cursor.getColumnIndex("file_id");
                                columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                columnIndex5 = cursor.getColumnIndex("font_weight");
                                columnIndex6 = cursor.getColumnIndex("font_italic");
                                while (cursor.moveToNext()) {
                                    if (columnIndex != -1) {
                                        i7 = cursor.getInt(columnIndex);
                                    } else {
                                        i7 = 0;
                                    }
                                    if (columnIndex4 != -1) {
                                        i10 = cursor.getInt(columnIndex4);
                                    } else {
                                        i10 = 0;
                                    }
                                    if (columnIndex3 == -1) {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                                    } else {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                                    }
                                    Uri uri2 = uriWithAppendedId;
                                    if (columnIndex5 != -1) {
                                        i11 = cursor.getInt(columnIndex5);
                                    } else {
                                        i11 = 400;
                                    }
                                    if (columnIndex6 == -1) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    arrayList.add(new m(uri2, i10, i11, z10, i7));
                                }
                                arrayList2 = arrayList;
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            dVar.a();
                            m[] mVarArr2 = (m[]) arrayList2.toArray(new m[0]);
                            Trace.endSection();
                            return mVarArr2;
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor2.close();
                }
                dVar.a();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
