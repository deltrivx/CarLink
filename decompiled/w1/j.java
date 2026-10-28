package w1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.x;
import java.util.ArrayList;
import q2.d1;
import q2.h0;
import q2.z0;
import r1.o;
import r2.j0;
import r2.q1;
import s.b0;
import s.d0;
import s.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2.u f14042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2.u f14043b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f14045d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f14047f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f14049h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f14044c = new s(2, null, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f14046e = new z0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f938a.f14044c.hashCode();
        }

        @Override // q2.z0
        public final o i() {
            return this.f938a.f14044c;
        }

        @Override // q2.z0
        public final /* bridge */ /* synthetic */ void j(o oVar) {
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f14048g = new d0(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public j(r2.u uVar, r2.u uVar2) {
        this.f14042a = uVar;
        this.f14043b = uVar2;
        this.f14045d = new g(this, uVar2);
    }

    public final boolean a(boolean z10) {
        d1 d1Var;
        s sVar = this.f14049h;
        if (sVar != null) {
            g(null);
            r rVar = r.f14069a;
            r rVar2 = r.f14072d;
            sVar.A0(rVar, rVar2);
            if (!sVar.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            r1.o oVar = sVar.f11117a.f11121e;
            h0 h0VarV = q2.f.v(sVar);
            while (h0VarV != null) {
                if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.f11119c & 1024) != 0) {
                            h1.e eVar = null;
                            r1.o oVarF = oVar;
                            while (oVarF != null) {
                                if (oVarF instanceof s) {
                                    ((s) oVarF).A0(r.f14070b, rVar2);
                                } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                    int i7 = 0;
                                    for (r1.o oVar2 = ((q2.m) oVarF).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                        if ((oVar2.f11119c & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                oVarF = oVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar.b(oVar2);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar);
                            }
                        }
                        oVar = oVar.f11121e;
                    }
                }
                h0VarV = h0VarV.v();
                oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
            }
        }
        return true;
    }

    public final boolean b(int i7, boolean z10, boolean z11) {
        int iOrdinal;
        boolean z12 = true;
        if (z10 || (iOrdinal = f.s(this.f14044c, i7).ordinal()) == 0) {
            a(z10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new cc.s();
            }
            z12 = false;
        }
        if (z12 && z11) {
            c();
        }
        return z12;
    }

    public final void c() {
        r2.u uVar = this.f14042a;
        if (uVar.isFocused() || uVar.hasFocus()) {
            uVar.clearFocus();
        } else if (uVar.hasFocus()) {
            View viewFindFocus = uVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            uVar.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0154 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0162 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:315:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:344:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0146 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[ADDED_TO_REGION, LOOP:12: B:41:0x0079->B:69:0x00c5, LOOP_START, PHI: r7
      0x0079: PHI (r7v27 r1.o) = (r7v22 r1.o), (r7v28 r1.o) binds: [B:40:0x0077, B:69:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff A[ADDED_TO_REGION, LOOP:16: B:87:0x00ff->B:115:0x014b, LOOP_START, PHI: r1
      0x00ff: PHI (r1v14 r1.o) = (r1v9 r1.o), (r1v15 r1.o) binds: [B:86:0x00fd, B:115:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0101 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0110 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0116 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r15v5, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r15v9, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    public final boolean d(KeyEvent keyEvent, h9.a aVar) {
        r1.o oVar;
        h0 h0VarV;
        Object obj;
        Object obj2;
        r1.o oVar2;
        d1 d1Var;
        r1.o oVarF;
        h1.e eVar;
        r1.o oVar3;
        h0 h0VarV2;
        Object obj3;
        Object obj4;
        d1 d1Var2;
        h1.e eVar2;
        r1.o oVarF2;
        int size;
        d1 d1Var3;
        s sVar = this.f14044c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f14045d.f14040e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!h(keyEvent)) {
                Trace.endSection();
                return false;
            }
            s sVarG = f.g(sVar);
            if (sVarG != null) {
                if (!sVarG.f11117a.f11129n) {
                    n2.a.b("visitLocalDescendants called on an unattached node");
                }
                r1.o oVar4 = sVarG.f11117a;
                if ((oVar4.f11120d & 9216) != 0) {
                    oVar2 = null;
                    for (r1.o oVar5 = oVar4.f11122f; oVar5 != null; oVar5 = oVar5.f11122f) {
                        int i7 = oVar5.f11119c;
                        if ((i7 & 9216) != 0) {
                            if ((i7 & 1024) != 0) {
                                break;
                            }
                            oVar2 = oVar5;
                        }
                    }
                } else {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    if (sVarG == null) {
                        if (!sVar.f11117a.f11129n) {
                            n2.a.b("visitAncestors called on an unattached node");
                        }
                        oVar = sVar.f11117a.f11121e;
                        h0VarV = q2.f.v(sVar);
                        loop15: while (true) {
                            if (h0VarV != null) {
                                obj = null;
                                break;
                            }
                            if ((h0VarV.E.f10617f.f11120d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                while (oVar != null) {
                                    if ((oVar.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                        oVarF = oVar;
                                        eVar = null;
                                        while (oVarF != null) {
                                            if (oVarF instanceof i2.d) {
                                                obj = oVarF;
                                                break loop15;
                                            }
                                            if ((oVarF.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 0) {
                                            }
                                            oVarF = q2.f.f(eVar);
                                        }
                                    }
                                    oVar = oVar.f11121e;
                                }
                            }
                            h0VarV = h0VarV.v();
                            if (h0VarV != null) {
                            }
                        }
                        obj2 = (i2.d) obj;
                        if (obj2 != null) {
                            oVar2 = ((r1.o) obj2).f11117a;
                        } else {
                            oVar2 = null;
                        }
                    } else {
                        if (!sVarG.f11117a.f11129n) {
                            n2.a.b("visitAncestors called on an unattached node");
                        }
                        oVar3 = sVarG.f11117a;
                        h0VarV2 = q2.f.v(sVarG);
                        loop11: while (true) {
                            if (h0VarV2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((h0VarV2.E.f10617f.f11120d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                while (oVar3 != null) {
                                    if ((oVar3.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                        eVar2 = null;
                                        oVarF2 = oVar3;
                                        while (oVarF2 != null) {
                                            if (oVarF2 instanceof i2.d) {
                                                obj3 = oVarF2;
                                                break loop11;
                                            }
                                            if ((oVarF2.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 0) {
                                            }
                                            oVarF2 = q2.f.f(eVar2);
                                        }
                                    }
                                    oVar3 = oVar3.f11121e;
                                }
                            }
                            h0VarV2 = h0VarV2.v();
                            if (h0VarV2 != null) {
                            }
                        }
                        obj4 = (i2.d) obj3;
                        if (obj4 != null) {
                            oVar2 = ((r1.o) obj4).f11117a;
                        } else {
                            if (!sVar.f11117a.f11129n) {
                                n2.a.b("visitAncestors called on an unattached node");
                            }
                            oVar = sVar.f11117a.f11121e;
                            h0VarV = q2.f.v(sVar);
                            loop15: while (true) {
                                if (h0VarV != null) {
                                    obj = null;
                                    break;
                                }
                                if ((h0VarV.E.f10617f.f11120d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                    while (oVar != null) {
                                        if ((oVar.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                            oVarF = oVar;
                                            eVar = null;
                                            while (oVarF != null) {
                                                if (oVarF instanceof i2.d) {
                                                    obj = oVarF;
                                                    break loop15;
                                                }
                                                if ((oVarF.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 0) {
                                                }
                                                oVarF = q2.f.f(eVar);
                                            }
                                        }
                                        oVar = oVar.f11121e;
                                    }
                                }
                                h0VarV = h0VarV.v();
                                if (h0VarV != null) {
                                }
                            }
                            obj2 = (i2.d) obj;
                            if (obj2 != null) {
                                oVar2 = ((r1.o) obj2).f11117a;
                            } else {
                                oVar2 = null;
                            }
                        }
                    }
                }
            } else if (sVarG == null) {
                if (!sVar.f11117a.f11129n) {
                    n2.a.b("visitAncestors called on an unattached node");
                }
                oVar = sVar.f11117a.f11121e;
                h0VarV = q2.f.v(sVar);
                loop15: while (true) {
                    if (h0VarV != null) {
                        obj = null;
                        break;
                    }
                    if ((h0VarV.E.f10617f.f11120d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                        while (oVar != null) {
                            if ((oVar.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                oVarF = oVar;
                                eVar = null;
                                while (oVarF != null) {
                                    if (oVarF instanceof i2.d) {
                                        obj = oVarF;
                                        break loop15;
                                    }
                                    if ((oVarF.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 0 && (oVarF instanceof q2.m)) {
                                        r1.o oVar6 = ((q2.m) oVarF).f10746p;
                                        int i10 = 0;
                                        while (oVar6 != null) {
                                            if ((oVar6.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    oVarF = oVarF;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    oVarF = oVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new h1.e(new r1.o[16]);
                                                    }
                                                    if (oVarF != null) {
                                                        eVar.b(oVarF);
                                                        oVarF = null;
                                                    }
                                                    eVar.b(oVar6);
                                                }
                                            } else {
                                                oVarF = oVarF;
                                                eVar = eVar;
                                            }
                                            oVar6 = oVar6.f11122f;
                                            oVarF = oVarF;
                                            eVar = eVar;
                                        }
                                        if (i10 == 1) {
                                            oVarF = oVarF;
                                            eVar = eVar;
                                        } else {
                                            oVarF = oVarF;
                                            eVar = eVar;
                                        }
                                    }
                                    oVarF = q2.f.f(eVar);
                                }
                            }
                            oVar = oVar.f11121e;
                        }
                    }
                    h0VarV = h0VarV.v();
                    oVar = (h0VarV != null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
                }
                obj2 = (i2.d) obj;
                if (obj2 != null) {
                    oVar2 = ((r1.o) obj2).f11117a;
                } else {
                    oVar2 = null;
                }
            } else {
                if (!sVarG.f11117a.f11129n) {
                    n2.a.b("visitAncestors called on an unattached node");
                }
                oVar3 = sVarG.f11117a;
                h0VarV2 = q2.f.v(sVarG);
                loop11: while (true) {
                    if (h0VarV2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((h0VarV2.E.f10617f.f11120d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                        while (oVar3 != null) {
                            if ((oVar3.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                eVar2 = null;
                                oVarF2 = oVar3;
                                while (oVarF2 != null) {
                                    if (oVarF2 instanceof i2.d) {
                                        obj3 = oVarF2;
                                        break loop11;
                                    }
                                    if ((oVarF2.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 0 && (oVarF2 instanceof q2.m)) {
                                        r1.o oVar7 = ((q2.m) oVarF2).f10746p;
                                        int i11 = 0;
                                        while (oVar7 != null) {
                                            if ((oVar7.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    oVarF2 = oVarF2;
                                                    eVar2 = eVar2;
                                                    eVar2 = eVar2;
                                                    oVarF2 = oVar7;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new h1.e(new r1.o[16]);
                                                    }
                                                    if (oVarF2 != null) {
                                                        eVar2.b(oVarF2);
                                                        oVarF2 = null;
                                                    }
                                                    eVar2.b(oVar7);
                                                }
                                            } else {
                                                oVarF2 = oVarF2;
                                                eVar2 = eVar2;
                                            }
                                            oVar7 = oVar7.f11122f;
                                            oVarF2 = oVarF2;
                                            eVar2 = eVar2;
                                        }
                                        if (i11 == 1) {
                                            oVarF2 = oVarF2;
                                            eVar2 = eVar2;
                                        } else {
                                            oVarF2 = oVarF2;
                                            eVar2 = eVar2;
                                        }
                                    }
                                    oVarF2 = q2.f.f(eVar2);
                                }
                            }
                            oVar3 = oVar3.f11121e;
                        }
                    }
                    h0VarV2 = h0VarV2.v();
                    oVar3 = (h0VarV2 != null || (d1Var2 = h0VarV2.E) == null) ? null : d1Var2.f10616e;
                }
                obj4 = (i2.d) obj3;
                if (obj4 != null) {
                    oVar2 = ((r1.o) obj4).f11117a;
                } else {
                    if (!sVar.f11117a.f11129n) {
                        n2.a.b("visitAncestors called on an unattached node");
                    }
                    oVar = sVar.f11117a.f11121e;
                    h0VarV = q2.f.v(sVar);
                    loop15: while (true) {
                        if (h0VarV != null) {
                            obj = null;
                            break;
                        }
                        if ((h0VarV.E.f10617f.f11120d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                            while (oVar != null) {
                                if ((oVar.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                    oVarF = oVar;
                                    eVar = null;
                                    while (oVarF != null) {
                                        if (oVarF instanceof i2.d) {
                                            obj = oVarF;
                                            break loop15;
                                        }
                                        if ((oVarF.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 0) {
                                        }
                                        oVarF = q2.f.f(eVar);
                                    }
                                }
                                oVar = oVar.f11121e;
                            }
                        }
                        h0VarV = h0VarV.v();
                        if (h0VarV != null) {
                        }
                    }
                    obj2 = (i2.d) obj;
                    if (obj2 != null) {
                        oVar2 = ((r1.o) obj2).f11117a;
                    } else {
                        oVar2 = null;
                    }
                }
            }
            if (oVar2 != null) {
                if (!oVar2.f11117a.f11129n) {
                    n2.a.b("visitAncestors called on an unattached node");
                }
                r1.o oVar8 = oVar2.f11117a.f11121e;
                h0 h0VarV3 = q2.f.v(oVar2);
                ArrayList arrayList = null;
                while (h0VarV3 != null) {
                    if ((h0VarV3.E.f10617f.f11120d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                        while (oVar8 != null) {
                            if ((oVar8.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                r1.o oVarF3 = oVar8;
                                h1.e eVar3 = null;
                                while (oVarF3 != null) {
                                    if (oVarF3 instanceof i2.d) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(oVarF3);
                                    } else if ((oVarF3.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0 && (oVarF3 instanceof q2.m)) {
                                        int i12 = 0;
                                        for (r1.o oVar9 = ((q2.m) oVarF3).f10746p; oVar9 != null; oVar9 = oVar9.f11122f) {
                                            if ((oVar9.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    oVarF3 = oVar9;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new h1.e(new r1.o[16]);
                                                    }
                                                    if (oVarF3 != null) {
                                                        eVar3.b(oVarF3);
                                                        oVarF3 = null;
                                                    }
                                                    eVar3.b(oVar9);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    oVarF3 = q2.f.f(eVar3);
                                }
                            }
                            oVar8 = oVar8.f11121e;
                        }
                    }
                    h0VarV3 = h0VarV3.v();
                    oVar8 = (h0VarV3 == null || (d1Var3 = h0VarV3.E) == null) ? null : d1Var3.f10616e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i13 = size - 1;
                        if (((i2.d) arrayList.get(size)).j(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i13 < 0) {
                            break;
                        }
                        size = i13;
                    }
                }
                ?? F = oVar2.f11117a;
                ?? eVar4 = 0;
                while (F != 0) {
                    if (F instanceof i2.d) {
                        if (((i2.d) F).j(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((F.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0 && (F instanceof q2.m)) {
                        r1.o oVar10 = ((q2.m) F).f10746p;
                        int i14 = 0;
                        while (oVar10 != null) {
                            if ((oVar10.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    F = F;
                                    eVar4 = eVar4;
                                    eVar4 = eVar4;
                                    F = oVar10;
                                } else {
                                    if (eVar4 == 0) {
                                        eVar4 = new h1.e(new r1.o[16]);
                                    }
                                    if (F != 0) {
                                        eVar4.b(F);
                                        F = 0;
                                    }
                                    eVar4.b(oVar10);
                                }
                            } else {
                                F = F;
                                eVar4 = eVar4;
                            }
                            oVar10 = oVar10.f11122f;
                            F = F;
                            eVar4 = eVar4;
                        }
                        if (i14 == 1) {
                            F = F;
                            eVar4 = eVar4;
                        } else {
                            F = F;
                            eVar4 = eVar4;
                        }
                    }
                    F = q2.f.f(eVar4);
                }
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? F2 = oVar2.f11117a;
                ?? eVar5 = 0;
                while (F2 != 0) {
                    if (F2 instanceof i2.d) {
                        if (((i2.d) F2).w(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((F2.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0 && (F2 instanceof q2.m)) {
                        r1.o oVar11 = ((q2.m) F2).f10746p;
                        int i15 = 0;
                        while (oVar11 != null) {
                            if ((oVar11.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    eVar5 = eVar5;
                                    F2 = F2;
                                    eVar5 = eVar5;
                                    F2 = oVar11;
                                } else {
                                    if (eVar5 == 0) {
                                        eVar5 = new h1.e(new r1.o[16]);
                                    }
                                    if (F2 != 0) {
                                        eVar5.b(F2);
                                        F2 = 0;
                                    }
                                    eVar5.b(oVar11);
                                }
                            } else {
                                eVar5 = eVar5;
                                F2 = F2;
                            }
                            oVar11 = oVar11.f11122f;
                            eVar5 = eVar5;
                            F2 = F2;
                        }
                        if (i15 == 1) {
                            eVar5 = eVar5;
                            F2 = F2;
                        } else {
                            eVar5 = eVar5;
                            F2 = F2;
                        }
                    }
                    F2 = q2.f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (((i2.d) arrayList.get(i16)).w(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r5v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [h9.k, i9.n] */
    /* JADX WARN: Type inference failed for: r6v17, types: [h9.k, i9.n] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final Boolean e(int i7, x1.c cVar, h9.k kVar) {
        Boolean bool;
        boolean zA;
        Object obj;
        d1 d1Var;
        ?? r8;
        s sVar = this.f14044c;
        s sVarG = f.g(sVar);
        int i10 = 4;
        r2.u uVar = this.f14043b;
        if (sVarG != null) {
            n3.o layoutDirection = uVar.getLayoutDirection();
            bool = null;
            m mVarB0 = sVarG.B0();
            o oVar = mVarB0.f14061h;
            o oVar2 = mVarB0.f14062i;
            if (i7 == 1) {
                oVar = mVarB0.f14055b;
            } else if (i7 == 2) {
                oVar = mVarB0.f14056c;
            } else if (i7 == 5) {
                oVar = mVarB0.f14057d;
            } else if (i7 == 6) {
                oVar = mVarB0.f14058e;
            } else if (i7 == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new cc.s();
                    }
                    oVar = oVar2;
                }
                if (oVar == o.f14064b) {
                    oVar = null;
                }
                if (oVar == null) {
                    oVar = mVarB0.f14059f;
                }
            } else if (i7 == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    oVar = oVar2;
                } else if (iOrdinal2 != 1) {
                    throw new cc.s();
                }
                if (oVar == o.f14064b) {
                    oVar = null;
                }
                if (oVar == null) {
                    oVar = mVarB0.f14060g;
                }
            } else {
                if (i7 != 7 && i7 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                a aVar = new a(i7);
                j jVar = (j) ((r2.u) q2.f.w(sVarG)).getFocusOwner();
                s sVar2 = jVar.f14049h;
                if (i7 == 7) {
                    mVarB0.f14063j.invoke(aVar);
                } else {
                    mVarB0.k.invoke(aVar);
                }
                if (aVar.f14027b) {
                    oVar = o.f14065c;
                } else {
                    oVar = sVar2 != jVar.f14049h ? o.f14066d : o.f14064b;
                }
            }
            if (!i9.l.a(oVar, o.f14065c)) {
                if (i9.l.a(oVar, o.f14066d)) {
                    s sVarG2 = f.g(sVar);
                    if (sVarG2 != null) {
                        return (Boolean) kVar.invoke(sVarG2);
                    }
                } else if (!i9.l.a(oVar, o.f14064b)) {
                    return Boolean.valueOf(oVar.a(kVar));
                }
            }
            return bool;
        }
        bool = null;
        sVarG = null;
        n3.o layoutDirection2 = uVar.getLayoutDirection();
        q3.e eVar = new q3.e(sVarG, this, kVar);
        if (i7 == 1 || i7 == 2) {
            if (i7 == 1) {
                zA = f.k(sVar, eVar);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = f.a(sVar, eVar);
            }
            return Boolean.valueOf(zA);
        }
        if (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) {
            return f.E(i7, eVar, sVar, cVar);
        }
        if (i7 == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new cc.s();
                }
                i10 = 3;
            }
            s sVarG3 = f.g(sVar);
            if (sVarG3 != null) {
                return f.E(i10, eVar, sVarG3, cVar);
            }
            return bool;
        }
        if (i7 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.a(i7))).toString());
        }
        s sVarG4 = f.g(sVar);
        boolean zBooleanValue = false;
        if (sVarG4 != null) {
            if (!sVarG4.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            Object obj2 = sVarG4.f11117a.f11121e;
            h0 h0VarV = q2.f.v(sVarG4);
            loop0: while (true) {
                if (h0VarV == null) {
                    obj = bool;
                    break;
                }
                if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                    while (r8 != 0) {
                        if ((r8.f11119c & 1024) != 0) {
                            ?? F = r8;
                            ?? eVar2 = bool;
                            while (F != 0) {
                                if (F instanceof s) {
                                    s sVar3 = (s) F;
                                    if (sVar3.B0().f14054a) {
                                        obj = sVar3;
                                        break loop0;
                                    }
                                } else if ((F.f11119c & 1024) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar3 = ((q2.m) F).f10746p;
                                    int i11 = 0;
                                    while (oVar3 != null) {
                                        if ((oVar3.f11119c & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                F = F;
                                                eVar2 = eVar2;
                                                eVar2 = eVar2;
                                                F = oVar3;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar2.b(F);
                                                    F = bool;
                                                }
                                                eVar2.b(oVar3);
                                            }
                                        } else {
                                            F = F;
                                            eVar2 = eVar2;
                                        }
                                        oVar3 = oVar3.f11122f;
                                        F = F;
                                        eVar2 = eVar2;
                                    }
                                    if (i11 == 1) {
                                        F = F;
                                        eVar2 = eVar2;
                                    } else {
                                        F = F;
                                        eVar2 = eVar2;
                                    }
                                }
                                F = q2.f.f(eVar2);
                            }
                        }
                        r8 = r8.f11121e;
                    }
                }
                r8 = obj2;
                h0VarV = h0VarV.v();
                obj2 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? bool : d1Var.f10616e;
            }
        } else {
            obj = bool;
            break;
        }
        if (obj != null && !obj.equals(sVar)) {
            zBooleanValue = ((Boolean) eVar.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean f(int i7) {
        boolean zY;
        View viewA;
        x xVar = new x();
        xVar.f6688a = Boolean.FALSE;
        s sVar = this.f14049h;
        r2.u uVar = this.f14042a;
        Boolean boolE = e(i7, uVar.getEmbeddedViewFocusRect(), new d1.a(i7, 1, xVar));
        if (!i9.l.a(boolE, Boolean.TRUE) || sVar == this.f14049h) {
            if (boolE != null && xVar.f6688a != null) {
                if (!boolE.booleanValue() || !((Boolean) xVar.f6688a).booleanValue()) {
                    if (i7 != 1 && i7 != 2) {
                        if (i7 == 7 || i7 == 8) {
                            zY = false;
                        } else {
                            Integer numC = f.C(i7);
                            if (numC == null) {
                                throw new IllegalStateException("Invalid focus direction");
                            }
                            int iIntValue = numC.intValue();
                            x1.c embeddedViewFocusRect = uVar.getEmbeddedViewFocusRect();
                            Rect rectZ = embeddedViewFocusRect != null ? y1.h0.z(embeddedViewFocusRect) : null;
                            Object obj = q1.f11372f.get();
                            i9.l.b(obj);
                            q1 q1Var = (q1) obj;
                            if (rectZ == null) {
                                viewA = q1Var.b(iIntValue, uVar.findFocus(), uVar);
                            } else {
                                q1Var.f11373a.set(rectZ);
                                Rect rect = q1Var.f11373a;
                                ArrayList<View> arrayList = q1Var.f11377e;
                                try {
                                    arrayList.clear();
                                    if (Build.VERSION.SDK_INT < 26) {
                                        j0.d(uVar, arrayList, uVar.isInTouchMode());
                                    } else {
                                        uVar.addFocusables(arrayList, iIntValue, uVar.isInTouchMode() ? 1 : 0);
                                    }
                                    viewA = arrayList.isEmpty() ? null : q1Var.a(iIntValue, rect, null, uVar, arrayList);
                                    arrayList.clear();
                                } catch (Throwable th) {
                                    arrayList.clear();
                                    throw th;
                                }
                            }
                            if (viewA != null) {
                                zY = f.y(viewA, Integer.valueOf(iIntValue), rectZ);
                            } else {
                                zY = false;
                            }
                        }
                        if (zY) {
                        }
                    } else if (b(i7, false, false)) {
                        Boolean boolE2 = e(i7, null, new r2.r(i7, 2));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(s sVar) {
        h0 h0VarV;
        y2.j jVarX;
        h0 h0VarV2;
        y2.j jVarX2;
        s sVar2 = this.f14049h;
        this.f14049h = sVar;
        d0 d0Var = this.f14048g;
        Object[] objArr = d0Var.f12407a;
        int i7 = d0Var.f12408b;
        for (int i10 = 0; i10 < i7; i10++) {
            s1.c cVar = (s1.c) objArr[i10];
            cVar.getClass();
            if (sVar2 != null && (h0VarV2 = q2.f.v(sVar2)) != null && (jVarX2 = h0VarV2.x()) != null && jVarX2.f15011a.b(y2.i.f14992g)) {
                ((AutofillManager) cVar.f12540a.f7772b).notifyViewExited(cVar.f12542c, h0VarV2.f10668b);
            }
            if (sVar != null && (h0VarV = q2.f.v(sVar)) != null && (jVarX = h0VarV.x()) != null && jVarX.f15011a.b(y2.i.f14992g)) {
                int i11 = h0VarV.f10668b;
                cVar.f12543d.f15694a.i(i11, new s1.a(cVar, i11));
            }
        }
    }

    public final boolean h(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j5;
        long j10;
        boolean z10;
        int iNumberOfTrailingZeros2;
        int i7;
        long[] jArr;
        long jF = i2.c.F(keyEvent);
        int iK = i2.c.K(keyEvent);
        int i10 = 8;
        int i11 = 0;
        int i12 = 1;
        if (iK != 2) {
            if (iK != 1) {
                return true;
            }
            b0 b0Var = this.f14047f;
            if (b0Var == null || !b0Var.a(jF)) {
                return false;
            }
            b0 b0Var2 = this.f14047f;
            if (b0Var2 == null) {
                return true;
            }
            int i13 = ((int) ((jF >>> 32) ^ jF)) * (-862048943);
            int i14 = (i13 << 16) ^ i13;
            int i15 = i14 & 127;
            int i16 = b0Var2.f12393c;
            int i17 = i14 >>> 7;
            loop5: while (true) {
                int i18 = i17 & i16;
                long[] jArr2 = b0Var2.f12391a;
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                long j11 = ((jArr2[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr2[i19] >>> i20);
                long j12 = (((long) i15) * 72340172838076673L) ^ j11;
                for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i18) & i16;
                    if (b0Var2.f12392b[iNumberOfTrailingZeros] == jF) {
                        break loop5;
                    }
                }
                if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i11 += 8;
                i17 = i18 + i11;
            }
            if (iNumberOfTrailingZeros < 0) {
                return true;
            }
            b0Var2.f12394d--;
            long[] jArr3 = b0Var2.f12391a;
            int i21 = b0Var2.f12393c;
            int i22 = iNumberOfTrailingZeros >> 3;
            int i23 = (iNumberOfTrailingZeros & 7) << 3;
            long j14 = (jArr3[i22] & (~(255 << i23))) | (254 << i23);
            jArr3[i22] = j14;
            jArr3[(((iNumberOfTrailingZeros - 7) & i21) + (i21 & 7)) >> 3] = j14;
            return true;
        }
        b0 b0Var3 = this.f14047f;
        if (b0Var3 == null) {
            b0Var3 = new b0(3);
            this.f14047f = b0Var3;
        }
        b0 b0Var4 = b0Var3;
        int i24 = ((int) (jF ^ (jF >>> 32))) * (-862048943);
        int i25 = i24 ^ (i24 << 16);
        int i26 = i25 >>> 7;
        int i27 = i25 & 127;
        int i28 = b0Var4.f12393c;
        int i29 = i26 & i28;
        int i30 = 0;
        loop0: while (true) {
            long[] jArr4 = b0Var4.f12391a;
            int i31 = i29 >> 3;
            int i32 = (i29 & 7) << 3;
            long j15 = (jArr4[i31] >>> i32) | ((jArr4[i31 + 1] << (64 - i32)) & ((-i32) >> 63));
            long j16 = i27;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            for (long j18 = (j17 - 72340172838076673L) & (~j17) & (-9187201950435737472L); j18 != 0; j18 &= j18 - 1) {
                iNumberOfTrailingZeros2 = (i29 + (Long.numberOfTrailingZeros(j18) >> 3)) & i28;
                if (b0Var4.f12392b[iNumberOfTrailingZeros2] == jF) {
                    z10 = true;
                    break loop0;
                }
            }
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b0Var4.b(i26);
                if (b0Var4.f12395e != 0 || ((b0Var4.f12391a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j5 = j16;
                    j10 = 128;
                    z10 = true;
                } else {
                    int i33 = b0Var4.f12393c;
                    if (i33 <= i10 || Long.compare((((long) b0Var4.f12394d) * 32) ^ Long.MIN_VALUE, (((long) i33) * 25) ^ Long.MIN_VALUE) > 0) {
                        i7 = i26;
                        j5 = j16;
                        j10 = 128;
                        z10 = true;
                        int iB2 = o0.b(b0Var4.f12393c);
                        long[] jArr5 = b0Var4.f12391a;
                        long[] jArr6 = b0Var4.f12392b;
                        int i34 = b0Var4.f12393c;
                        b0Var4.c(iB2);
                        long[] jArr7 = b0Var4.f12391a;
                        long[] jArr8 = b0Var4.f12392b;
                        int i35 = b0Var4.f12393c;
                        int i36 = 0;
                        while (i36 < i34) {
                            if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                                long j19 = jArr6[i36];
                                int i37 = ((int) ((j19 >>> 32) ^ j19)) * (-862048943);
                                int i38 = (i37 << 16) ^ i37;
                                int iB3 = b0Var4.b(i38 >>> 7);
                                long j20 = i38 & 127;
                                int i39 = iB3 >> 3;
                                int i40 = (iB3 & 7) << 3;
                                long j21 = (jArr7[i39] & (~(255 << i40))) | (j20 << i40);
                                jArr7[i39] = j21;
                                jArr7[(((iB3 - 7) & i35) + (i35 & 7)) >> 3] = j21;
                                jArr8[iB3] = j19;
                            }
                            i36++;
                            jArr5 = jArr5;
                            jArr6 = jArr6;
                        }
                    } else {
                        long[] jArr9 = b0Var4.f12391a;
                        int i41 = b0Var4.f12393c;
                        long[] jArr10 = b0Var4.f12392b;
                        int i42 = (i41 + 7) >> 3;
                        int i43 = 0;
                        while (i43 < i42) {
                            long j22 = jArr9[i43] & (-9187201950435737472L);
                            jArr9[i43] = (-72340172838076674L) & ((~j22) + (j22 >>> 7));
                            i43++;
                            j16 = j16;
                        }
                        j5 = j16;
                        j10 = 128;
                        int iZ0 = u8.l.z0(jArr9);
                        int i44 = iZ0 - 1;
                        long j23 = 72057594037927935L;
                        jArr9[i44] = (jArr9[i44] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iZ0] = jArr9[0];
                        int i45 = 0;
                        while (i45 != i41) {
                            int i46 = i45 >> 3;
                            int i47 = (i45 & 7) << 3;
                            long j24 = (jArr9[i46] >> i47) & 255;
                            if (j24 != 128 && j24 == 254) {
                                long j25 = jArr10[i45];
                                int i48 = ((int) (j25 ^ (j25 >>> 32))) * (-862048943);
                                int i49 = (i48 << 16) ^ i48;
                                int i50 = i49 >>> 7;
                                int iB4 = b0Var4.b(i50);
                                int i51 = i50 & i41;
                                if (((iB4 - i51) & i41) / 8 == ((i45 - i51) & i41) / 8) {
                                    long j26 = j23;
                                    jArr9[i46] = (((long) (i49 & 127)) << i47) | (jArr9[i46] & (~(255 << i47)));
                                    jArr9[jArr9.length - i12] = (jArr9[0] & j26) | Long.MIN_VALUE;
                                    i45++;
                                    j23 = j26;
                                } else {
                                    long j27 = j23;
                                    int i52 = iB4 >> 3;
                                    long j28 = jArr9[i52];
                                    int i53 = (iB4 & 7) << 3;
                                    if (((j28 >> i53) & 255) == 128) {
                                        jArr = jArr10;
                                        jArr9[i52] = ((~(255 << i53)) & j28) | (((long) (i49 & 127)) << i53);
                                        jArr9[i46] = (jArr9[i46] & (~(255 << i47))) | (128 << i47);
                                        jArr[iB4] = jArr[i45];
                                        jArr[i45] = 0;
                                    } else {
                                        jArr = jArr10;
                                        jArr9[i52] = (((long) (i49 & 127)) << i53) | ((~(255 << i53)) & j28);
                                        long j29 = jArr[iB4];
                                        jArr[iB4] = jArr[i45];
                                        jArr[i45] = j29;
                                        i45--;
                                    }
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j27) | Long.MIN_VALUE;
                                    i45++;
                                    jArr10 = jArr;
                                    i41 = i41;
                                    j23 = j27;
                                    i26 = i26;
                                    i12 = 1;
                                }
                            } else {
                                i45++;
                            }
                        }
                        i7 = i26;
                        z10 = true;
                        b0Var4.f12395e = o0.a(b0Var4.f12393c) - b0Var4.f12394d;
                    }
                    iB = b0Var4.b(i7);
                }
                iNumberOfTrailingZeros2 = iB;
                b0Var4.f12394d++;
                int i54 = b0Var4.f12395e;
                long[] jArr11 = b0Var4.f12391a;
                int i55 = iNumberOfTrailingZeros2 >> 3;
                long j30 = jArr11[i55];
                int i56 = (iNumberOfTrailingZeros2 & 7) << 3;
                b0Var4.f12395e = i54 - (((j30 >> i56) & 255) == j10 ? 1 : 0);
                int i57 = b0Var4.f12393c;
                long j31 = (j30 & (~(255 << i56))) | (j5 << i56);
                jArr11[i55] = j31;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i57) + (i57 & 7)) >> 3] = j31;
                break;
            }
            i30 += 8;
            i29 = (i29 + i30) & i28;
            i10 = 8;
            i12 = 1;
        }
        b0Var4.f12392b[iNumberOfTrailingZeros2] = jF;
        return z10;
    }
}
