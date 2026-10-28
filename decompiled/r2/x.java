package r2;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.baidu.carlifevehicle.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends a2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f11505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var) {
        super(14);
        this.f11505c = b0Var;
    }

    @Override // a2.d
    public final void i(int i7, f4.f fVar, String str, Bundle bundle) {
        this.f11505c.e(i7, fVar, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0202  */
    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:115:0x021c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0226  */
    /* JADX WARN: Code duplicated, block: B:119:0x0235  */
    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:123:0x025a  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02db  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:140:0x02df  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:149:0x0305  */
    /* JADX WARN: Code duplicated, block: B:151:0x030f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0320  */
    /* JADX WARN: Code duplicated, block: B:157:0x0355  */
    /* JADX WARN: Code duplicated, block: B:160:0x0360  */
    /* JADX WARN: Code duplicated, block: B:162:0x0370  */
    /* JADX WARN: Code duplicated, block: B:168:0x038e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0396  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a8 A[LOOP:3: B:170:0x0394->B:173:0x03a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:180:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:191:0x0415  */
    /* JADX WARN: Code duplicated, block: B:195:0x042f  */
    /* JADX WARN: Code duplicated, block: B:197:0x043f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0464  */
    /* JADX WARN: Code duplicated, block: B:207:0x0472  */
    /* JADX WARN: Code duplicated, block: B:209:0x0479  */
    /* JADX WARN: Code duplicated, block: B:211:0x048f  */
    /* JADX WARN: Code duplicated, block: B:213:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:215:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:217:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:220:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:225:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:228:0x0500  */
    /* JADX WARN: Code duplicated, block: B:231:0x050d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0511  */
    /* JADX WARN: Code duplicated, block: B:235:0x0529  */
    /* JADX WARN: Code duplicated, block: B:238:0x052f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0533  */
    /* JADX WARN: Code duplicated, block: B:241:0x0538  */
    /* JADX WARN: Code duplicated, block: B:243:0x053c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x054e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0554  */
    /* JADX WARN: Code duplicated, block: B:252:0x0558  */
    /* JADX WARN: Code duplicated, block: B:254:0x055f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0569  */
    /* JADX WARN: Code duplicated, block: B:262:0x057b  */
    /* JADX WARN: Code duplicated, block: B:264:0x0583  */
    /* JADX WARN: Code duplicated, block: B:267:0x0589  */
    /* JADX WARN: Code duplicated, block: B:268:0x0590  */
    /* JADX WARN: Code duplicated, block: B:272:0x059d  */
    /* JADX WARN: Code duplicated, block: B:275:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:277:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:280:0x05bd A[LOOP:8: B:276:0x05a4->B:280:0x05bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:286:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:289:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:291:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:292:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:294:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:296:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:298:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:300:0x0601  */
    /* JADX WARN: Code duplicated, block: B:301:0x0605  */
    /* JADX WARN: Code duplicated, block: B:304:0x0628  */
    /* JADX WARN: Code duplicated, block: B:305:0x062d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0647  */
    /* JADX WARN: Code duplicated, block: B:310:0x065a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0664  */
    /* JADX WARN: Code duplicated, block: B:313:0x066b  */
    /* JADX WARN: Code duplicated, block: B:316:0x068e  */
    /* JADX WARN: Code duplicated, block: B:318:0x069c  */
    /* JADX WARN: Code duplicated, block: B:319:0x069e  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:323:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:324:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:325:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:330:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:331:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:333:0x06b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:337:0x06be  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:340:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:345:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:347:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:350:0x0708  */
    /* JADX WARN: Code duplicated, block: B:353:0x071a  */
    /* JADX WARN: Code duplicated, block: B:355:0x0724  */
    /* JADX WARN: Code duplicated, block: B:358:0x073a  */
    /* JADX WARN: Code duplicated, block: B:361:0x0751  */
    /* JADX WARN: Code duplicated, block: B:364:0x0767  */
    /* JADX WARN: Code duplicated, block: B:368:0x0779  */
    /* JADX WARN: Code duplicated, block: B:369:0x0780  */
    /* JADX WARN: Code duplicated, block: B:371:0x0783  */
    /* JADX WARN: Code duplicated, block: B:374:0x0796  */
    /* JADX WARN: Code duplicated, block: B:378:0x079f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:380:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:382:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:383:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:386:0x07df  */
    /* JADX WARN: Code duplicated, block: B:390:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:392:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:396:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:399:0x0808  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:401:0x080e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0814  */
    /* JADX WARN: Code duplicated, block: B:408:0x0825  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:411:0x0829 A[LOOP:9: B:400:0x080c->B:411:0x0829, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:414:0x0832  */
    /* JADX WARN: Code duplicated, block: B:416:0x0838  */
    /* JADX WARN: Code duplicated, block: B:418:0x0840  */
    /* JADX WARN: Code duplicated, block: B:420:0x0849  */
    /* JADX WARN: Code duplicated, block: B:422:0x084c  */
    /* JADX WARN: Code duplicated, block: B:425:0x0851  */
    /* JADX WARN: Code duplicated, block: B:428:0x0860  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:430:0x0870  */
    /* JADX WARN: Code duplicated, block: B:434:0x0879  */
    /* JADX WARN: Code duplicated, block: B:436:0x087c  */
    /* JADX WARN: Code duplicated, block: B:441:0x0891  */
    /* JADX WARN: Code duplicated, block: B:444:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:447:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:450:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:452:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:456:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:459:0x0928  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:463:0x0952  */
    /* JADX WARN: Code duplicated, block: B:466:0x097b  */
    /* JADX WARN: Code duplicated, block: B:469:0x0986  */
    /* JADX WARN: Code duplicated, block: B:472:0x09aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:475:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:477:0x09be  */
    /* JADX WARN: Code duplicated, block: B:479:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:482:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:483:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:485:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:488:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:491:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:493:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:496:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:501:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:504:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:514:0x0a42 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:527:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:538:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:541:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:544:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:545:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:548:0x0ad7  */
    /* JADX WARN: Code duplicated, block: B:550:0x0ae5  */
    /* JADX WARN: Code duplicated, block: B:553:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:556:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:561:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:563:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:565:0x0b6c  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b77  */
    /* JADX WARN: Code duplicated, block: B:568:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ba6  */
    /* JADX WARN: Code duplicated, block: B:575:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:577:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:579:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:581:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:583:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:586:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:588:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:592:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:593:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:596:0x0c1f  */
    /* JADX WARN: Code duplicated, block: B:598:0x0c29 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:599:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:601:0x0c31 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:602:0x0c33  */
    /* JADX WARN: Code duplicated, block: B:604:0x0c40  */
    /* JADX WARN: Code duplicated, block: B:607:0x0c4b  */
    /* JADX WARN: Code duplicated, block: B:610:0x0c57  */
    /* JADX WARN: Code duplicated, block: B:614:0x0c6e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0c83  */
    /* JADX WARN: Code duplicated, block: B:629:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:630:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:655:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x082e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0830 A[EDGE_INSN: B:658:0x0830->B:413:0x0830 BREAK  A[LOOP:9: B:400:0x080c->B:411:0x0829], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0191  */
    /* JADX WARN: Code duplicated, block: B:89:0x0197  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01db  */
    /* JADX WARN: Instruction removed from duplicated block: B:588:0x0be7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:625:0x0c83, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r1v51, types: [q2.h0] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53, types: [q2.h0] */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r2v64, types: [u8.w] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v117 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r6v146 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v22, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [r2.b0] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v4, types: [r2.b0] */
    @Override // a2.d
    public final f4.f k(int i7) throws Throwable {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        f4.f fVar;
        int i10;
        Throwable th;
        y2.m mVarL;
        Integer numValueOf;
        int iIntValue;
        s.u uVar;
        s.r0 r0Var;
        Resources resources;
        y2.j jVar;
        s.h0 h0Var;
        Object objG;
        y2.g gVar;
        AccessibilityManager accessibilityManager;
        s.r0 r0Var2;
        boolean zF;
        boolean zH;
        List listJ;
        int size;
        boolean z10;
        int i11;
        int i12;
        int i13;
        ?? r8;
        b3.h hVarM;
        s.u uVar2;
        y2.m mVar;
        s.h0 h0Var2;
        y2.g gVar2;
        y2.j jVar2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        f4.f fVar2;
        ?? r10;
        y2.u uVar3;
        s.h0 h0Var3;
        ?? r11;
        y2.m mVar2;
        String strL;
        Object objG2;
        a3.a aVar;
        Object objG3;
        Boolean bool;
        y2.g gVar3;
        int i14;
        y2.j jVar3;
        Object objG4;
        List list;
        ?? r12;
        Object objG5;
        String str;
        Object objG6;
        f4.f fVar3;
        int i15;
        Integer num;
        int iIntValue2;
        y2.u uVar4;
        b0 b0Var;
        boolean z11;
        ?? r13;
        y2.a aVar2;
        y2.a aVar3;
        y2.a aVar4;
        String strP;
        boolean z12;
        y2.f fVar4;
        int i16;
        y2.h hVar;
        y2.h hVar2;
        CharSequence charSequence;
        boolean zC;
        int i17;
        int iD;
        u uVar5;
        int iD2;
        String str2;
        f4.f fVar5;
        q3.i iVarU;
        q3.i iVarU2;
        y2.a aVar5;
        y2.a aVar6;
        y2.a aVar7;
        y2.j jVarM;
        y2.u uVar6;
        List list2;
        int size2;
        s.v vVar;
        s.r0 r0Var3;
        s.c0 c0Var;
        int[] iArr;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        s.c0 c0Var2;
        ArrayList arrayList;
        int i21;
        Object objG7;
        boolean z13;
        Object objG8;
        Object objG9;
        boolean z14;
        boolean zU;
        n3.o oVar;
        q2.h0 h0Var4;
        boolean z15;
        f4.d dVar;
        boolean z16;
        f4.d dVar2;
        Object objG10;
        float f10;
        y2.j jVarM2;
        y2.u uVar7;
        ArrayList arrayList2;
        CharSequence charSequenceE;
        boolean z17;
        y2.a aVar8;
        ?? r14;
        List list3;
        boolean z18;
        ?? V;
        y2.j jVarX;
        boolean zA;
        Object objG11;
        y2.j jVarX2;
        boolean z19;
        boolean z20;
        y2.a aVar9;
        y2.a aVar10;
        y2.a aVar11;
        y2.a aVar12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        int iD3;
        y2.m mVarL2;
        boolean zBooleanValue;
        y2.j jVar4;
        y2.u uVar8;
        boolean zBooleanValue2;
        Object objG12;
        n3.c density;
        a2.b bVar;
        SpannableString spannableString;
        List list4;
        ArrayList arrayList3;
        SpannableString spannableString2;
        ?? arrayList4;
        ?? arrayList5;
        int size3;
        int i22;
        ?? arrayList6;
        int size4;
        int i23;
        int size5;
        int i24;
        b3.f fVar6;
        int i25;
        Object obj;
        int i26;
        b3.n nVar;
        WeakHashMap weakHashMap;
        Object gVar4;
        b3.f fVar7;
        b3.m mVar3;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size6;
        int i27;
        b3.f fVar8;
        b3.s0 s0Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size7;
        int i28;
        b3.f fVar9;
        b3.t0 t0Var;
        int i29;
        int i30;
        int size8;
        int i31;
        b3.f fVar10;
        int size9;
        int i32;
        int i33;
        int i34;
        long jB;
        f3.k kVar;
        f3.i iVar;
        m3.p pVar;
        long j5;
        m3.l lVar;
        m3.o oVar2;
        m3.o cVar;
        m3.o oVar3;
        SpannableString spannableString3;
        f3.k kVar2;
        int i35;
        int i36;
        int i37;
        y2.m mVar4;
        s.k kVarO;
        int i38;
        q3.i iVar2;
        y2.n nVar2;
        boolean zA2;
        y2.m mVar5;
        int i39;
        int i40;
        String strW;
        Object parentForAccessibility;
        View view;
        ?? r15;
        androidx.lifecycle.v vVarG;
        b0 b0Var2 = this.f11505c;
        AccessibilityManager accessibilityManager2 = b0Var2.f11172g;
        u uVar9 = b0Var2.f11169d;
        l viewTreeOwners = uVar9.getViewTreeOwners();
        if (((viewTreeOwners == null || (vVarG = viewTreeOwners.f11318a.g()) == null) ? null : vVarG.f1072c) == androidx.lifecycle.o.f1056a) {
            if (accessibilityManager2.isEnabled()) {
                fVar5 = null;
            } else {
                fVar5 = new f4.f(AccessibilityNodeInfo.obtain());
            }
            i15 = i7;
            r15 = b0Var2;
        } else {
            y2.n nVar3 = (y2.n) b0Var2.o().b(i7);
            if (nVar3 == null) {
                if (accessibilityManager2.isEnabled()) {
                    fVar5 = null;
                } else {
                    fVar5 = new f4.f(AccessibilityNodeInfo.obtain());
                }
                i15 = i7;
                r15 = b0Var2;
            } else {
                y2.m mVar6 = nVar3.f15024a;
                y2.j jVarK = mVar6.k();
                q2.h0 h0Var5 = mVar6.f15019c;
                Object objG13 = jVarK.f15011a.g(y2.r.f15062n);
                if (objG13 == null) {
                    objG13 = null;
                }
                boolean zA3 = i9.l.a(objG13, Boolean.TRUE);
                if (!zA3) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    fVar = new f4.f(accessibilityNodeInfoObtain);
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 34) {
                        c.a.k(accessibilityNodeInfoObtain, zA3);
                    } else {
                        fVar.f(64, zA3);
                    }
                    if (i7 == -1) {
                        parentForAccessibility = uVar9.getParentForAccessibility();
                        th = null;
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        fVar.f5288b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        th = null;
                        mVarL = mVar6.l();
                        if (mVarL != null) {
                            numValueOf = Integer.valueOf(mVarL.f15023g);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            n2.a.c("semanticsNode " + i7 + " has null parent");
                            throw new cc.s();
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == uVar9.getSemanticsOwner().a().f15023g) {
                            iIntValue = -1;
                        }
                        fVar.f5288b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(uVar9, iIntValue);
                    }
                    fVar.f5289c = i7;
                    accessibilityNodeInfoObtain.setSource(uVar9, i7);
                    accessibilityNodeInfoObtain.setBoundsInScreen(b0Var2.f(nVar3));
                    uVar = b0Var2.M;
                    r0Var = b0Var2.f11186v;
                    resources = uVar9.getContext().getResources();
                    fVar.g("android.view.View");
                    jVar = mVar6.f15020d;
                    h0Var = jVar.f15011a;
                    if (h0Var.c(y2.r.E)) {
                        fVar.g("android.widget.EditText");
                    }
                    if (h0Var.c(y2.r.A)) {
                        fVar.g("android.widget.TextView");
                    }
                    objG = h0Var.g(y2.r.f15072x);
                    if (objG == null) {
                        objG = th;
                    }
                    gVar = (y2.g) objG;
                    if (gVar != null) {
                        i39 = gVar.f14983a;
                        accessibilityManager = accessibilityManager2;
                        if (mVar6.f15021e) {
                            i40 = 4;
                            r0Var2 = r0Var;
                            if (y2.m.j(4, mVar6).isEmpty()) {
                            }
                        } else {
                            i40 = 4;
                            r0Var2 = r0Var;
                        }
                        if (i39 == i40) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i39 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strW = j0.w(i39);
                            if (i39 == 5 || mVar6.o() || jVar.f15013c) {
                                fVar.g(strW);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        r0Var2 = r0Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(uVar9.getContext().getPackageName());
                    zF = y2.p.f(mVar6);
                    if (i10 >= 24) {
                        accessibilityNodeInfoObtain.setImportantForAccessibility(zF);
                    }
                    if (i10 >= 34) {
                        zH = c.a.h(accessibilityManager);
                    } else {
                        zH = true;
                    }
                    listJ = y2.m.j(4, mVar6);
                    size = listJ.size();
                    z10 = zH;
                    i11 = 0;
                    i12 = 0;
                    while (i12 < size) {
                        int i41 = i12;
                        mVar4 = (y2.m) listJ.get(i12);
                        int i42 = size;
                        kVarO = b0Var2.o();
                        List list5 = listJ;
                        i38 = mVar4.f15023g;
                        if (kVarO.a(i38)) {
                            iVar2 = uVar9.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(mVar4.f15019c);
                            if (i38 != -1) {
                                if (iVar2 != null) {
                                    accessibilityNodeInfoObtain.addChild(iVar2);
                                } else {
                                    nVar2 = (y2.n) b0Var2.o().b(i38);
                                    if (nVar2 != null || (mVar5 = nVar2.f15024a) == null) {
                                        zA2 = false;
                                    } else {
                                        Object objG14 = mVar5.k().f15011a.g(y2.r.f15062n);
                                        if (objG14 == null) {
                                            objG14 = th;
                                        }
                                        zA2 = i9.l.a(objG14, Boolean.TRUE);
                                    }
                                    if (z10 || !zA2) {
                                        accessibilityNodeInfoObtain.addChild(uVar9, i38);
                                    }
                                }
                                uVar.f(i38, i11);
                                i11++;
                            }
                        }
                        i12 = i41 + 1;
                        size = i42;
                        listJ = list5;
                    }
                    i13 = b0Var2.f11178n;
                    r8 = fVar.f5287a;
                    if (i7 == i13) {
                        r8.setAccessibilityFocused(true);
                        fVar.a(f4.d.f5276d);
                    } else {
                        r8.setAccessibilityFocused(false);
                        fVar.a(f4.d.f5275c);
                    }
                    hVarM = j0.m(mVar6);
                    if (hVarM != null) {
                        uVar9.getFontFamilyResolver();
                        density = uVar9.getDensity();
                        bVar = b0Var2.I;
                        String str3 = hVarM.f1353b;
                        list4 = hVarM.f1352a;
                        spannableString = new SpannableString(str3);
                        arrayList3 = hVarM.f1354c;
                        if (arrayList3 != null) {
                            size9 = arrayList3.size();
                            i32 = 0;
                            while (i32 < size9) {
                                ArrayList arrayList7 = arrayList3;
                                b3.f fVar11 = (b3.f) arrayList3.get(i32);
                                int i43 = i32;
                                b3.h0 h0Var6 = (b3.h0) fVar11.f1324a;
                                int i44 = size9;
                                i33 = fVar11.f1325b;
                                i34 = fVar11.f1326c;
                                s.u uVar10 = uVar;
                                y2.g gVar5 = gVar;
                                y2.j jVar5 = jVar;
                                jB = h0Var6.f1356a.b();
                                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                                f4.f fVar12 = fVar;
                                long j10 = h0Var6.f1357b;
                                kVar = h0Var6.f1358c;
                                iVar = h0Var6.f1359d;
                                pVar = h0Var6.f1365j;
                                i3.b bVar2 = h0Var6.k;
                                y2.m mVar7 = mVar6;
                                s.h0 h0Var7 = h0Var;
                                j5 = h0Var6.f1366l;
                                lVar = h0Var6.f1367m;
                                oVar2 = h0Var6.f1356a;
                                if (y1.q.c(jB, oVar2.b())) {
                                    oVar3 = oVar2;
                                } else {
                                    if (jB != 16) {
                                        cVar = new m3.c(jB);
                                    } else {
                                        cVar = m3.n.f8425a;
                                    }
                                    oVar3 = cVar;
                                }
                                g5.a.h0(spannableString, oVar3.b(), i33, i34);
                                spannableString3 = spannableString;
                                g5.a.k0(spannableString3, j10, density, i33, i34);
                                if (kVar == null || iVar != null) {
                                    if (kVar == null) {
                                        kVar2 = f3.k.f5258c;
                                    } else {
                                        kVar2 = kVar;
                                    }
                                    if (iVar != null) {
                                        i35 = iVar.f5255a;
                                    } else {
                                        i35 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(g5.a.F(kVar2, i35));
                                    i36 = 33;
                                    spannableString3.setSpan(styleSpan, i33, i34, 33);
                                } else {
                                    i36 = 33;
                                }
                                if (lVar != null) {
                                    i37 = lVar.f8423a;
                                    if ((i37 | 1) == i37) {
                                        spannableString3.setSpan(new UnderlineSpan(), i33, i34, i36);
                                    }
                                    if ((i37 | 2) == i37) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i33, i34, i36);
                                    }
                                }
                                if (pVar != null) {
                                    spannableString3.setSpan(new ScaleXSpan(pVar.f8427a), i33, i34, i36);
                                }
                                g5.a.n0(spannableString3, bVar2, i33, i34);
                                if (j5 != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(y1.h0.C(j5)), i33, i34, i36);
                                }
                                i32 = i43 + 1;
                                spannableString = spannableString3;
                                arrayList3 = arrayList7;
                                size9 = i44;
                                uVar = uVar10;
                                jVar = jVar5;
                                gVar = gVar5;
                                fVar = fVar12;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo2;
                                mVar6 = mVar7;
                                h0Var = h0Var7;
                            }
                        }
                        uVar2 = uVar;
                        mVar = mVar6;
                        h0Var2 = h0Var;
                        gVar2 = gVar;
                        jVar2 = jVar;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        fVar2 = fVar;
                        spannableString2 = spannableString;
                        int length = str3.length();
                        arrayList4 = u8.w.f13122a;
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size8 = list4.size();
                            while (i31 < size8) {
                                Object obj2 = list4.get(i31);
                                fVar10 = (b3.f) obj2;
                                if (!(fVar10.f1324a instanceof b3.t0) && b3.i.b(0, length, fVar10.f1325b, fVar10.f1326c)) {
                                    arrayList5.add(obj2);
                                }
                            }
                        } else {
                            arrayList5 = arrayList4;
                        }
                        size3 = arrayList5.size();
                        while (i22 < size3) {
                            b3.f fVar13 = (b3.f) arrayList5.get(i22);
                            t0Var = (b3.t0) fVar13.f1324a;
                            i29 = fVar13.f1325b;
                            i30 = fVar13.f1326c;
                            if (t0Var instanceof b3.t0) {
                                throw new cc.s();
                            }
                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(t0Var.f1452a).build(), i29, i30, 33);
                        }
                        int length2 = str3.length();
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size7 = list4.size();
                            while (i28 < size7) {
                                Object obj3 = list4.get(i28);
                                fVar9 = (b3.f) obj3;
                                if (!(fVar9.f1324a instanceof b3.s0) && b3.i.b(0, length2, fVar9.f1325b, fVar9.f1326c)) {
                                    arrayList6.add(obj3);
                                }
                            }
                        } else {
                            arrayList6 = arrayList4;
                        }
                        size4 = arrayList6.size();
                        while (i23 < size4) {
                            b3.f fVar14 = (b3.f) arrayList6.get(i23);
                            s0Var = (b3.s0) fVar14.f1324a;
                            int i45 = fVar14.f1325b;
                            int i46 = fVar14.f1326c;
                            weakHashMap3 = (WeakHashMap) bVar.f12b;
                            uRLSpan2 = weakHashMap3.get(s0Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(s0Var.f1448a);
                                weakHashMap3.put(s0Var, uRLSpan2);
                            }
                            spannableString2.setSpan((URLSpan) uRLSpan2, i45, i46, 33);
                        }
                        int length3 = str3.length();
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            size6 = list4.size();
                            while (i27 < size6) {
                                Object obj4 = list4.get(i27);
                                fVar8 = (b3.f) obj4;
                                if (!(fVar8.f1324a instanceof b3.n) && b3.i.b(0, length3, fVar8.f1325b, fVar8.f1326c)) {
                                    arrayList4.add(obj4);
                                }
                            }
                        }
                        size5 = arrayList4.size();
                        while (i24 < size5) {
                            fVar6 = (b3.f) arrayList4.get(i24);
                            i25 = fVar6.f1325b;
                            obj = fVar6.f1324a;
                            i26 = fVar6.f1326c;
                            if (i25 != i26) {
                                nVar = (b3.n) obj;
                                if (nVar instanceof b3.m) {
                                    i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    mVar3 = (b3.m) obj;
                                    fVar7 = new b3.f(i25, i26, mVar3);
                                    weakHashMap2 = (WeakHashMap) bVar.f13c;
                                    uRLSpan = weakHashMap2.get(fVar7);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(mVar3.f1389a);
                                        weakHashMap2.put(fVar7, uRLSpan);
                                    }
                                    spannableString2.setSpan((URLSpan) uRLSpan, i25, i26, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) bVar.f14d;
                                    gVar4 = weakHashMap.get(fVar6);
                                    if (gVar4 == null) {
                                        gVar4 = new j3.g(nVar);
                                        weakHashMap.put(fVar6, gVar4);
                                    }
                                    spannableString2.setSpan((ClickableSpan) gVar4, i25, i26, 33);
                                }
                            }
                        }
                        r10 = (SpannableString) b0.J(spannableString2);
                    } else {
                        b0Var2 = b0Var2;
                        uVar2 = uVar;
                        mVar = mVar6;
                        h0Var2 = h0Var;
                        gVar2 = gVar;
                        jVar2 = jVar;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        fVar2 = fVar;
                        r10 = th;
                    }
                    r8.setText(r10);
                    uVar3 = y2.r.K;
                    h0Var3 = h0Var2;
                    if (h0Var3.c(uVar3)) {
                        AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        objG12 = h0Var3.g(uVar3);
                        if (objG12 == null) {
                            objG12 = th;
                        }
                        accessibilityNodeInfo3.setError((CharSequence) objG12);
                        r11 = accessibilityNodeInfo3;
                    } else {
                        r11 = accessibilityNodeInfo;
                    }
                    mVar2 = mVar;
                    strL = j0.l(mVar2, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        e4.h.f(r8, strL);
                    } else {
                        r8.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strL);
                    }
                    r11.setCheckable(j0.k(mVar2));
                    objG2 = h0Var3.g(y2.r.I);
                    if (objG2 == null) {
                        objG2 = th;
                    }
                    aVar = (a3.a) objG2;
                    if (aVar != null) {
                        if (aVar == a3.a.f28a) {
                            r8.setChecked(true);
                        } else if (aVar == a3.a.f29b) {
                            r8.setChecked(false);
                        }
                    }
                    objG3 = h0Var3.g(y2.r.H);
                    if (objG3 == null) {
                        objG3 = th;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (gVar2 == null) {
                            gVar3 = gVar2;
                            i14 = 4;
                        } else {
                            gVar3 = gVar2;
                            i14 = 4;
                            if (gVar3.f14983a == 4) {
                                r11.setSelected(zBooleanValue2);
                            }
                        }
                        r8.setChecked(zBooleanValue2);
                    } else {
                        gVar3 = gVar2;
                        i14 = 4;
                    }
                    jVar3 = jVar2;
                    if (jVar3.f15013c || y2.m.j(i14, mVar2).isEmpty()) {
                        objG4 = h0Var3.g(y2.r.f15050a);
                        if (objG4 == null) {
                            objG4 = th;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            r12 = (String) u8.p.m0(list);
                        } else {
                            r12 = th;
                        }
                        r11.setContentDescription(r12);
                    }
                    objG5 = h0Var3.g(y2.r.f15073y);
                    if (objG5 == null) {
                        objG5 = th;
                    }
                    str = (String) objG5;
                    if (str != null) {
                        mVarL2 = mVar2;
                        while (true) {
                            if (mVarL2 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            jVar4 = mVarL2.f15020d;
                            uVar8 = y2.s.f15075a;
                            if (jVar4.f15011a.c(uVar8)) {
                                zBooleanValue = ((Boolean) jVar4.k(uVar8)).booleanValue();
                                break;
                            }
                            mVarL2 = mVarL2.l();
                        }
                        if (zBooleanValue) {
                            r11.setViewIdResourceName(str);
                        }
                    }
                    objG6 = h0Var3.g(y2.r.f15057h);
                    if (objG6 == null) {
                        objG6 = th;
                    }
                    if (((t8.z) objG6) == null) {
                        fVar3 = fVar2;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        r8.setHeading(true);
                        fVar3 = fVar2;
                    } else {
                        fVar3 = fVar2;
                        fVar3.f(2, true);
                    }
                    i15 = i7;
                    if (i15 != -1) {
                        iD3 = uVar2.d(mVar2.f15023g);
                        if (iD3 != -1) {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            r11.setDrawingOrder(iD3);
                        }
                    }
                    r11.setPassword(h0Var3.c(y2.r.J));
                    r11.setEditable(h0Var3.c(y2.r.M));
                    num = (Integer) y2.p.d(jVar3, y2.r.N);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    r11.setMaxTextLength(iIntValue2);
                    r11.setEnabled(j0.a(mVar2));
                    uVar4 = y2.r.k;
                    r11.setFocusable(h0Var3.c(uVar4));
                    if (r11.isFocusable()) {
                        r11.setFocused(((Boolean) jVar3.k(uVar4)).booleanValue());
                        if (r11.isFocused()) {
                            r8.addAction(2);
                            b0 b0Var3 = b0Var2;
                            b0Var3.f11179o = i15;
                            b0Var = b0Var3;
                        } else {
                            r13 = b0Var2;
                            z11 = true;
                            r8.addAction(1);
                        }
                        r8.setVisibleToUser(y2.p.e(mVar2) ^ z11);
                        a2.f.N(y2.p.d(jVar3, y2.r.f15059j));
                        r8.setClickable(false);
                        aVar2 = (y2.a) y2.p.d(jVar3, y2.i.f14987b);
                        if (aVar2 != null) {
                            boolean zA4 = i9.l.a(y2.p.d(jVar3, y2.r.H), Boolean.TRUE);
                            if (gVar3 == null && gVar3.f14983a == 4) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (z21) {
                                z22 = true;
                            } else {
                                if (gVar3 == null && gVar3.f14983a == 3) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (z24) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                            }
                            if (z22 || (z22 && !zA4)) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            r8.setClickable(z23);
                            if (j0.a(mVar2) && r11.isClickable()) {
                                fVar3.a(new f4.d(16, aVar2.f14969a));
                            }
                        }
                        r8.setLongClickable(false);
                        aVar3 = (y2.a) y2.p.d(jVar3, y2.i.f14988c);
                        if (aVar3 != null) {
                            r8.setLongClickable(true);
                            if (j0.a(mVar2)) {
                                fVar3.a(new f4.d(32, aVar3.f14969a));
                            }
                        }
                        aVar4 = (y2.a) y2.p.d(jVar3, y2.i.f15000p);
                        if (aVar4 != null) {
                            fVar3.a(new f4.d(16384, aVar4.f14969a));
                        }
                        if (j0.a(mVar2)) {
                            aVar9 = (y2.a) y2.p.d(jVar3, y2.i.f14995j);
                            if (aVar9 != null) {
                                fVar3.a(new f4.d(2097152, aVar9.f14969a));
                            }
                            aVar10 = (y2.a) y2.p.d(jVar3, y2.i.f14999o);
                            if (aVar10 != null) {
                                fVar3.a(new f4.d(android.R.id.accessibilityActionImeEnter, aVar10.f14969a));
                            }
                            aVar11 = (y2.a) y2.p.d(jVar3, y2.i.f15001q);
                            if (aVar11 != null) {
                                fVar3.a(new f4.d(65536, aVar11.f14969a));
                            }
                            aVar12 = (y2.a) y2.p.d(jVar3, y2.i.f15002r);
                            if (aVar12 != null && r11.isFocused()) {
                                primaryClipDescription = uVar9.getClipboardManager().f11247a.getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    fVar3.a(new f4.d(32768, aVar12.f14969a));
                                }
                            }
                        }
                        strP = b0.p(mVar2);
                        if (strP != null || strP.length() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            r11.setTextSelection(r13.n(mVar2), r13.m(mVar2));
                            aVar8 = (y2.a) y2.p.d(jVar3, y2.i.f14994i);
                            if (aVar8 != null) {
                                r14 = aVar8.f14969a;
                            } else {
                                r14 = th;
                            }
                            fVar3.a(new f4.d(131072, r14));
                            r8.addAction(256);
                            r8.addAction(512);
                            r8.setMovementGranularities(11);
                            list3 = (List) y2.p.d(jVar3, y2.r.f15050a);
                            if (list3 != null || list3.isEmpty()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z18 && h0Var3.c(y2.i.f14986a)) {
                                if (h0Var3.c(y2.r.E) || i9.l.a(y2.p.d(jVar3, uVar4), Boolean.TRUE)) {
                                    V = h0Var5.v();
                                    while (true) {
                                        if (V == 0) {
                                            V = th;
                                            break;
                                        }
                                        jVarX2 = V.x();
                                        if (jVarX2 != null || !jVarX2.f15013c) {
                                            z19 = false;
                                        } else if (jVarX2.f15011a.c(y2.r.E)) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z19) {
                                            break;
                                        }
                                        V = V.v();
                                    }
                                    if (V != 0) {
                                        jVarX = V.x();
                                        if (jVarX != null) {
                                            objG11 = jVarX.f15011a.g(uVar4);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            zA = i9.l.a(objG11, Boolean.TRUE);
                                        } else {
                                            zA = false;
                                        }
                                        z20 = zA ? false : true;
                                    }
                                }
                                if (!z20) {
                                    r8.setMovementGranularities(r11.getMovementGranularities() | 20);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList2 = new ArrayList();
                            arrayList2.add("androidx.compose.ui.semantics.id");
                            charSequenceE = fVar3.e();
                            if (charSequenceE != null || charSequenceE.length() == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (!z17 && jVar3.c(y2.i.f14986a)) {
                                arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (jVar3.c(y2.r.f15073y)) {
                                arrayList2.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (mVar2.m().c(y2.r.O)) {
                                arrayList2.add("androidx.compose.ui.semantics.shapeType");
                                arrayList2.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList2.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList2.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            mVar2.m().getClass();
                            if (Build.VERSION.SDK_INT >= 26) {
                                r8.setAvailableExtraData(arrayList2);
                            }
                        }
                        fVar4 = (y2.f) y2.p.d(mVar2.m(), y2.r.f15052c);
                        if (fVar4 != null) {
                            f10 = fVar4.f14980a;
                            jVarM2 = mVar2.m();
                            uVar7 = y2.i.f14993h;
                            if (jVarM2.c(uVar7)) {
                                fVar3.g("android.widget.SeekBar");
                            } else {
                                fVar3.g("android.widget.ProgressBar");
                            }
                            y2.f fVar15 = y2.f.f14979d;
                            if (fVar4 != y2.f.f14979d) {
                                r8.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new f4.e(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue(), f10)).f5285a);
                            }
                            if (mVar2.m().c(uVar7) && j0.a(mVar2)) {
                                if (f10 < n3.r.i(Float.valueOf(fVar4.a().f8964b).floatValue(), Float.valueOf(fVar4.a().f8963a).floatValue())) {
                                    fVar3.a(f4.d.f5277e);
                                }
                                if (f10 > n3.r.j(Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue())) {
                                    fVar3.a(f4.d.f5278f);
                                }
                            }
                        }
                        i16 = Build.VERSION.SDK_INT;
                        if (i16 >= 24) {
                            j0.f(fVar3, mVar2);
                        }
                        n3.l.U(fVar3, mVar2);
                        n3.l.V(fVar3, mVar2);
                        hVar = (y2.h) y2.p.d(mVar2.m(), y2.r.f15068t);
                        y2.a aVar13 = (y2.a) y2.p.d(mVar2.m(), y2.i.f14989d);
                        if (hVar != null && aVar13 != null) {
                            objG9 = mVar2.k().f15011a.g(y2.r.f15055f);
                            if (objG9 == null) {
                                objG9 = th;
                            }
                            if (objG9 == null) {
                                objG10 = mVar2.k().f15011a.g(y2.r.f15054e);
                                if (objG10 == null) {
                                    objG10 = th;
                                }
                                if (objG10 != null) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = true;
                            }
                            if (!z14) {
                                fVar3.g("android.widget.HorizontalScrollView");
                            }
                            if (((Number) hVar.f14985b.invoke()).floatValue() > 0.0f) {
                                r8.setScrollable(true);
                            }
                            if (j0.a(mVar2)) {
                                zU = b0.u(hVar);
                                oVar = n3.o.f8750b;
                                if (zU) {
                                    fVar3.a(f4.d.f5277e);
                                    h0Var4 = h0Var5;
                                    if (h0Var4.f10690y == oVar) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        dVar2 = f4.d.f5282j;
                                    } else {
                                        dVar2 = f4.d.f5280h;
                                    }
                                    fVar3.a(dVar2);
                                } else {
                                    h0Var4 = h0Var5;
                                }
                                if (b0.t(hVar)) {
                                    fVar3.a(f4.d.f5278f);
                                    if (h0Var4.f10690y == oVar) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        dVar = f4.d.f5280h;
                                    } else {
                                        dVar = f4.d.f5282j;
                                    }
                                    fVar3.a(dVar);
                                }
                            }
                        }
                        hVar2 = (y2.h) y2.p.d(mVar2.m(), y2.r.f15069u);
                        if (hVar2 != null && aVar13 != null) {
                            objG7 = mVar2.k().f15011a.g(y2.r.f15055f);
                            if (objG7 == null) {
                                objG7 = th;
                            }
                            if (objG7 == null) {
                                objG8 = mVar2.k().f15011a.g(y2.r.f15054e);
                                if (objG8 == null) {
                                    objG8 = th;
                                }
                                if (objG8 != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = true;
                            }
                            if (!z13) {
                                fVar3.g("android.widget.ScrollView");
                            }
                            if (((Number) hVar2.f14985b.invoke()).floatValue() > 0.0f) {
                                r8.setScrollable(true);
                            }
                            if (j0.a(mVar2)) {
                                if (b0.u(hVar2)) {
                                    fVar3.a(f4.d.f5277e);
                                    fVar3.a(f4.d.f5281i);
                                }
                                if (b0.t(hVar2)) {
                                    fVar3.a(f4.d.f5278f);
                                    fVar3.a(f4.d.f5279g);
                                }
                            }
                        }
                        if (i16 >= 29) {
                            j0.e(fVar3, mVar2);
                        }
                        charSequence = (CharSequence) y2.p.d(mVar2.m(), y2.r.f15053d);
                        if (i16 >= 28) {
                            r8.setPaneTitle(charSequence);
                        } else {
                            r8.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (j0.a(mVar2)) {
                            aVar5 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15003s);
                            if (aVar5 != null) {
                                fVar3.a(new f4.d(262144, aVar5.f14969a));
                            }
                            aVar6 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15004t);
                            if (aVar6 != null) {
                                fVar3.a(new f4.d(524288, aVar6.f14969a));
                            }
                            aVar7 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15005u);
                            if (aVar7 != null) {
                                fVar3.a(new f4.d(1048576, aVar7.f14969a));
                            }
                            jVarM = mVar2.m();
                            uVar6 = y2.i.f15007w;
                            if (jVarM.c(uVar6)) {
                                list2 = (List) mVar2.m().k(uVar6);
                                size2 = list2.size();
                                vVar = b0.Q;
                                if (size2 < vVar.f12509b) {
                                    throw new IllegalStateException("Can't have more than " + vVar.f12509b + " custom actions for one widget");
                                }
                                s.r0 r0Var4 = new s.r0(0);
                                s.c0 c0VarA = s.l0.a();
                                r0Var3 = r0Var2;
                                if (r0Var3.c(i15)) {
                                    c0Var = (s.c0) r0Var3.d(i15);
                                    iArr = vVar.f12508a;
                                    i18 = vVar.f12509b;
                                    iArr2 = new int[16];
                                    i19 = 0;
                                    i20 = 0;
                                    while (i19 < i18) {
                                        int i47 = iArr[i19];
                                        int i48 = i18;
                                        i21 = i20 + 1;
                                        s.c0 c0Var3 = c0Var;
                                        if (iArr2.length < i21) {
                                            int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i21, (iArr2.length * 3) / 2));
                                            i9.l.d(iArrCopyOf, "copyOf(...)");
                                            iArr2 = iArrCopyOf;
                                        }
                                        iArr2[i20] = i47;
                                        i19++;
                                        i20 = i21;
                                        i18 = i48;
                                        c0Var = c0Var3;
                                    }
                                    c0Var2 = c0Var;
                                    arrayList = new ArrayList();
                                    if (list2.size() <= 0) {
                                        a2.f.N(list2.get(0));
                                        i9.l.b(c0Var2);
                                        throw th;
                                    }
                                    if (arrayList.size() > 0) {
                                        a2.f.N(arrayList.get(0));
                                        if (i20 > 0) {
                                            int i49 = iArr2[0];
                                            throw th;
                                        }
                                        t.a.d("Index must be between 0 and size");
                                        throw th;
                                    }
                                } else if (list2.size() > 0) {
                                    a2.f.N(list2.get(0));
                                    vVar.b(0);
                                    throw th;
                                }
                                r13.f11185u.e(i15, r0Var4);
                                r0Var3.e(i15, c0VarA);
                            }
                        }
                        zC = j0.c(mVar2, resources);
                        i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 28) {
                            r8.setScreenReaderFocusable(zC);
                        } else {
                            fVar3.f(1, zC);
                        }
                        iD = r13.E.d(i15);
                        if (iD != -1) {
                            iVarU2 = j0.u(uVar9.getAndroidViewsHandler$ui_release(), iD);
                            if (iVarU2 != null) {
                                if (i17 >= 22) {
                                    uVar5 = uVar9;
                                    r8.setTraversalBefore(uVar5, iD);
                                }
                                r13.e(i15, fVar3, r13.G, th);
                            } else if (i17 >= 22) {
                                r8.setTraversalBefore(iVarU2);
                            }
                            uVar5 = uVar9;
                            r13.e(i15, fVar3, r13.G, th);
                        } else {
                            uVar5 = uVar9;
                        }
                        iD2 = r13.F.d(i15);
                        if (iD2 != -1 && (iVarU = j0.u(uVar5.getAndroidViewsHandler$ui_release(), iD2)) != null) {
                            if (i17 >= 22) {
                                r8.setTraversalAfter(iVarU);
                            }
                            r13.e(i15, fVar3, r13.H, null);
                        }
                        str2 = (String) y2.p.d(mVar2.m(), y2.s.f15076b);
                        if (str2 != null) {
                            fVar3.g(str2);
                        }
                        fVar5 = fVar3;
                        r15 = r13;
                    } else {
                        b0Var = b0Var2;
                    }
                    z11 = true;
                    r13 = b0Var;
                    r8.setVisibleToUser(y2.p.e(mVar2) ^ z11);
                    a2.f.N(y2.p.d(jVar3, y2.r.f15059j));
                    r8.setClickable(false);
                    aVar2 = (y2.a) y2.p.d(jVar3, y2.i.f14987b);
                    if (aVar2 != null) {
                        boolean zA5 = i9.l.a(y2.p.d(jVar3, y2.r.H), Boolean.TRUE);
                        if (gVar3 == null) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        if (z21) {
                            z22 = true;
                        } else {
                            if (gVar3 == null) {
                                z24 = false;
                            } else {
                                z24 = true;
                            }
                            if (z24) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                        }
                        if (z22) {
                            z23 = true;
                        } else {
                            z23 = true;
                        }
                        r8.setClickable(z23);
                        if (j0.a(mVar2)) {
                            fVar3.a(new f4.d(16, aVar2.f14969a));
                        }
                    }
                    r8.setLongClickable(false);
                    aVar3 = (y2.a) y2.p.d(jVar3, y2.i.f14988c);
                    if (aVar3 != null) {
                        r8.setLongClickable(true);
                        if (j0.a(mVar2)) {
                            fVar3.a(new f4.d(32, aVar3.f14969a));
                        }
                    }
                    aVar4 = (y2.a) y2.p.d(jVar3, y2.i.f15000p);
                    if (aVar4 != null) {
                        fVar3.a(new f4.d(16384, aVar4.f14969a));
                    }
                    if (j0.a(mVar2)) {
                        aVar9 = (y2.a) y2.p.d(jVar3, y2.i.f14995j);
                        if (aVar9 != null) {
                            fVar3.a(new f4.d(2097152, aVar9.f14969a));
                        }
                        aVar10 = (y2.a) y2.p.d(jVar3, y2.i.f14999o);
                        if (aVar10 != null) {
                            fVar3.a(new f4.d(android.R.id.accessibilityActionImeEnter, aVar10.f14969a));
                        }
                        aVar11 = (y2.a) y2.p.d(jVar3, y2.i.f15001q);
                        if (aVar11 != null) {
                            fVar3.a(new f4.d(65536, aVar11.f14969a));
                        }
                        aVar12 = (y2.a) y2.p.d(jVar3, y2.i.f15002r);
                        if (aVar12 != null) {
                            primaryClipDescription = uVar9.getClipboardManager().f11247a.getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                fVar3.a(new f4.d(32768, aVar12.f14969a));
                            }
                        }
                    }
                    strP = b0.p(mVar2);
                    if (strP != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        r11.setTextSelection(r13.n(mVar2), r13.m(mVar2));
                        aVar8 = (y2.a) y2.p.d(jVar3, y2.i.f14994i);
                        if (aVar8 != null) {
                            r14 = aVar8.f14969a;
                        } else {
                            r14 = th;
                        }
                        fVar3.a(new f4.d(131072, r14));
                        r8.addAction(256);
                        r8.addAction(512);
                        r8.setMovementGranularities(11);
                        list3 = (List) y2.p.d(jVar3, y2.r.f15050a);
                        if (list3 != null) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (z18) {
                            if (h0Var3.c(y2.r.E)) {
                                V = h0Var5.v();
                                while (true) {
                                    if (V == 0) {
                                        V = th;
                                        break;
                                    }
                                    jVarX2 = V.x();
                                    if (jVarX2 != null) {
                                        z19 = false;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        break;
                                        break;
                                    }
                                    V = V.v();
                                }
                                if (V != 0) {
                                    jVarX = V.x();
                                    if (jVarX != null) {
                                        objG11 = jVarX.f15011a.g(uVar4);
                                        if (objG11 == null) {
                                            objG11 = th;
                                        }
                                        zA = i9.l.a(objG11, Boolean.TRUE);
                                    } else {
                                        zA = false;
                                    }
                                    if (zA) {
                                    }
                                }
                            } else {
                                V = h0Var5.v();
                                while (true) {
                                    if (V == 0) {
                                        V = th;
                                        break;
                                    }
                                    jVarX2 = V.x();
                                    if (jVarX2 != null) {
                                        z19 = false;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        break;
                                        break;
                                    }
                                    V = V.v();
                                }
                                if (V != 0) {
                                    jVarX = V.x();
                                    if (jVarX != null) {
                                        objG11 = jVarX.f15011a.g(uVar4);
                                        if (objG11 == null) {
                                            objG11 = th;
                                        }
                                        zA = i9.l.a(objG11, Boolean.TRUE);
                                    } else {
                                        zA = false;
                                    }
                                    if (zA) {
                                    }
                                }
                            }
                            if (!z20) {
                                r8.setMovementGranularities(r11.getMovementGranularities() | 20);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        arrayList2 = new ArrayList();
                        arrayList2.add("androidx.compose.ui.semantics.id");
                        charSequenceE = fVar3.e();
                        if (charSequenceE != null) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (!z17) {
                            arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (jVar3.c(y2.r.f15073y)) {
                            arrayList2.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (mVar2.m().c(y2.r.O)) {
                            arrayList2.add("androidx.compose.ui.semantics.shapeType");
                            arrayList2.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList2.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList2.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        mVar2.m().getClass();
                        if (Build.VERSION.SDK_INT >= 26) {
                            r8.setAvailableExtraData(arrayList2);
                        }
                    }
                    fVar4 = (y2.f) y2.p.d(mVar2.m(), y2.r.f15052c);
                    if (fVar4 != null) {
                        f10 = fVar4.f14980a;
                        jVarM2 = mVar2.m();
                        uVar7 = y2.i.f14993h;
                        if (jVarM2.c(uVar7)) {
                            fVar3.g("android.widget.SeekBar");
                        } else {
                            fVar3.g("android.widget.ProgressBar");
                        }
                        y2.f fVar16 = y2.f.f14979d;
                        if (fVar4 != y2.f.f14979d) {
                            r8.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new f4.e(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue(), f10)).f5285a);
                        }
                        if (mVar2.m().c(uVar7)) {
                            if (f10 < n3.r.i(Float.valueOf(fVar4.a().f8964b).floatValue(), Float.valueOf(fVar4.a().f8963a).floatValue())) {
                                fVar3.a(f4.d.f5277e);
                            }
                            if (f10 > n3.r.j(Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue())) {
                                fVar3.a(f4.d.f5278f);
                            }
                        }
                    }
                    i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 24) {
                        j0.f(fVar3, mVar2);
                    }
                    n3.l.U(fVar3, mVar2);
                    n3.l.V(fVar3, mVar2);
                    hVar = (y2.h) y2.p.d(mVar2.m(), y2.r.f15068t);
                    y2.a aVar14 = (y2.a) y2.p.d(mVar2.m(), y2.i.f14989d);
                    if (hVar != null) {
                        objG9 = mVar2.k().f15011a.g(y2.r.f15055f);
                        if (objG9 == null) {
                            objG9 = th;
                        }
                        if (objG9 == null) {
                            objG10 = mVar2.k().f15011a.g(y2.r.f15054e);
                            if (objG10 == null) {
                                objG10 = th;
                            }
                            if (objG10 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = true;
                        }
                        if (!z14) {
                            fVar3.g("android.widget.HorizontalScrollView");
                        }
                        if (((Number) hVar.f14985b.invoke()).floatValue() > 0.0f) {
                            r8.setScrollable(true);
                        }
                        if (j0.a(mVar2)) {
                            zU = b0.u(hVar);
                            oVar = n3.o.f8750b;
                            if (zU) {
                                fVar3.a(f4.d.f5277e);
                                h0Var4 = h0Var5;
                                if (h0Var4.f10690y == oVar) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    dVar2 = f4.d.f5282j;
                                } else {
                                    dVar2 = f4.d.f5280h;
                                }
                                fVar3.a(dVar2);
                            } else {
                                h0Var4 = h0Var5;
                            }
                            if (b0.t(hVar)) {
                                fVar3.a(f4.d.f5278f);
                                if (h0Var4.f10690y == oVar) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    dVar = f4.d.f5280h;
                                } else {
                                    dVar = f4.d.f5282j;
                                }
                                fVar3.a(dVar);
                            }
                        }
                    }
                    hVar2 = (y2.h) y2.p.d(mVar2.m(), y2.r.f15069u);
                    if (hVar2 != null) {
                        objG7 = mVar2.k().f15011a.g(y2.r.f15055f);
                        if (objG7 == null) {
                            objG7 = th;
                        }
                        if (objG7 == null) {
                            objG8 = mVar2.k().f15011a.g(y2.r.f15054e);
                            if (objG8 == null) {
                                objG8 = th;
                            }
                            if (objG8 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = true;
                        }
                        if (!z13) {
                            fVar3.g("android.widget.ScrollView");
                        }
                        if (((Number) hVar2.f14985b.invoke()).floatValue() > 0.0f) {
                            r8.setScrollable(true);
                        }
                        if (j0.a(mVar2)) {
                            if (b0.u(hVar2)) {
                                fVar3.a(f4.d.f5277e);
                                fVar3.a(f4.d.f5281i);
                            }
                            if (b0.t(hVar2)) {
                                fVar3.a(f4.d.f5278f);
                                fVar3.a(f4.d.f5279g);
                            }
                        }
                    }
                    if (i16 >= 29) {
                        j0.e(fVar3, mVar2);
                    }
                    charSequence = (CharSequence) y2.p.d(mVar2.m(), y2.r.f15053d);
                    if (i16 >= 28) {
                        r8.setPaneTitle(charSequence);
                    } else {
                        r8.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (j0.a(mVar2)) {
                        aVar5 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15003s);
                        if (aVar5 != null) {
                            fVar3.a(new f4.d(262144, aVar5.f14969a));
                        }
                        aVar6 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15004t);
                        if (aVar6 != null) {
                            fVar3.a(new f4.d(524288, aVar6.f14969a));
                        }
                        aVar7 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15005u);
                        if (aVar7 != null) {
                            fVar3.a(new f4.d(1048576, aVar7.f14969a));
                        }
                        jVarM = mVar2.m();
                        uVar6 = y2.i.f15007w;
                        if (jVarM.c(uVar6)) {
                            list2 = (List) mVar2.m().k(uVar6);
                            size2 = list2.size();
                            vVar = b0.Q;
                            if (size2 < vVar.f12509b) {
                                throw new IllegalStateException("Can't have more than " + vVar.f12509b + " custom actions for one widget");
                            }
                            s.r0 r0Var5 = new s.r0(0);
                            s.c0 c0VarA2 = s.l0.a();
                            r0Var3 = r0Var2;
                            if (r0Var3.c(i15)) {
                                c0Var = (s.c0) r0Var3.d(i15);
                                iArr = vVar.f12508a;
                                i18 = vVar.f12509b;
                                iArr2 = new int[16];
                                i19 = 0;
                                i20 = 0;
                                while (i19 < i18) {
                                    int i410 = iArr[i19];
                                    int i411 = i18;
                                    i21 = i20 + 1;
                                    s.c0 c0Var4 = c0Var;
                                    if (iArr2.length < i21) {
                                        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, Math.max(i21, (iArr2.length * 3) / 2));
                                        i9.l.d(iArrCopyOf2, "copyOf(...)");
                                        iArr2 = iArrCopyOf2;
                                    }
                                    iArr2[i20] = i410;
                                    i19++;
                                    i20 = i21;
                                    i18 = i411;
                                    c0Var = c0Var4;
                                }
                                c0Var2 = c0Var;
                                arrayList = new ArrayList();
                                if (list2.size() <= 0) {
                                    a2.f.N(list2.get(0));
                                    i9.l.b(c0Var2);
                                    throw th;
                                }
                                if (arrayList.size() > 0) {
                                    a2.f.N(arrayList.get(0));
                                    if (i20 > 0) {
                                        int i412 = iArr2[0];
                                        throw th;
                                    }
                                    t.a.d("Index must be between 0 and size");
                                    throw th;
                                }
                            } else if (list2.size() > 0) {
                                a2.f.N(list2.get(0));
                                vVar.b(0);
                                throw th;
                            }
                            r13.f11185u.e(i15, r0Var5);
                            r0Var3.e(i15, c0VarA2);
                        }
                    }
                    zC = j0.c(mVar2, resources);
                    i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 28) {
                        r8.setScreenReaderFocusable(zC);
                    } else {
                        fVar3.f(1, zC);
                    }
                    iD = r13.E.d(i15);
                    if (iD != -1) {
                        iVarU2 = j0.u(uVar9.getAndroidViewsHandler$ui_release(), iD);
                        if (iVarU2 != null) {
                            if (i17 >= 22) {
                                uVar5 = uVar9;
                                r8.setTraversalBefore(uVar5, iD);
                            }
                            r13.e(i15, fVar3, r13.G, th);
                        } else if (i17 >= 22) {
                            r8.setTraversalBefore(iVarU2);
                        }
                        uVar5 = uVar9;
                        r13.e(i15, fVar3, r13.G, th);
                    } else {
                        uVar5 = uVar9;
                    }
                    iD2 = r13.F.d(i15);
                    if (iD2 != -1) {
                        if (i17 >= 22) {
                            r8.setTraversalAfter(iVarU);
                        }
                        r13.e(i15, fVar3, r13.H, null);
                    }
                    str2 = (String) y2.p.d(mVar2.m(), y2.s.f15076b);
                    if (str2 != null) {
                        fVar3.g(str2);
                    }
                    fVar5 = fVar3;
                    r15 = r13;
                } else if (Build.VERSION.SDK_INT >= 34 ? c.a.h(accessibilityManager2) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    fVar = new f4.f(accessibilityNodeInfoObtain);
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 34) {
                        c.a.k(accessibilityNodeInfoObtain, zA3);
                    } else {
                        fVar.f(64, zA3);
                    }
                    if (i7 == -1) {
                        parentForAccessibility = uVar9.getParentForAccessibility();
                        th = null;
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        fVar.f5288b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        th = null;
                        mVarL = mVar6.l();
                        if (mVarL != null) {
                            numValueOf = Integer.valueOf(mVarL.f15023g);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            n2.a.c("semanticsNode " + i7 + " has null parent");
                            throw new cc.s();
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == uVar9.getSemanticsOwner().a().f15023g) {
                            iIntValue = -1;
                        }
                        fVar.f5288b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(uVar9, iIntValue);
                    }
                    fVar.f5289c = i7;
                    accessibilityNodeInfoObtain.setSource(uVar9, i7);
                    accessibilityNodeInfoObtain.setBoundsInScreen(b0Var2.f(nVar3));
                    uVar = b0Var2.M;
                    r0Var = b0Var2.f11186v;
                    resources = uVar9.getContext().getResources();
                    fVar.g("android.view.View");
                    jVar = mVar6.f15020d;
                    h0Var = jVar.f15011a;
                    if (h0Var.c(y2.r.E)) {
                        fVar.g("android.widget.EditText");
                    }
                    if (h0Var.c(y2.r.A)) {
                        fVar.g("android.widget.TextView");
                    }
                    objG = h0Var.g(y2.r.f15072x);
                    if (objG == null) {
                        objG = th;
                    }
                    gVar = (y2.g) objG;
                    if (gVar != null) {
                        i39 = gVar.f14983a;
                        accessibilityManager = accessibilityManager2;
                        if (mVar6.f15021e) {
                            i40 = 4;
                            r0Var2 = r0Var;
                        } else {
                            i40 = 4;
                            r0Var2 = r0Var;
                            if (y2.m.j(4, mVar6).isEmpty()) {
                            }
                        }
                        if (i39 == i40) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i39 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strW = j0.w(i39);
                            if (i39 == 5) {
                                fVar.g(strW);
                            } else {
                                fVar.g(strW);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        r0Var2 = r0Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(uVar9.getContext().getPackageName());
                    zF = y2.p.f(mVar6);
                    if (i10 >= 24) {
                        accessibilityNodeInfoObtain.setImportantForAccessibility(zF);
                    }
                    if (i10 >= 34) {
                        zH = c.a.h(accessibilityManager);
                    } else {
                        zH = true;
                    }
                    listJ = y2.m.j(4, mVar6);
                    size = listJ.size();
                    z10 = zH;
                    i11 = 0;
                    i12 = 0;
                    while (i12 < size) {
                        int i413 = i12;
                        mVar4 = (y2.m) listJ.get(i12);
                        int i414 = size;
                        kVarO = b0Var2.o();
                        List list6 = listJ;
                        i38 = mVar4.f15023g;
                        if (kVarO.a(i38)) {
                            iVar2 = uVar9.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(mVar4.f15019c);
                            if (i38 != -1) {
                                if (iVar2 != null) {
                                    accessibilityNodeInfoObtain.addChild(iVar2);
                                } else {
                                    nVar2 = (y2.n) b0Var2.o().b(i38);
                                    if (nVar2 != null) {
                                        zA2 = false;
                                    } else {
                                        zA2 = false;
                                    }
                                    if (z10) {
                                        accessibilityNodeInfoObtain.addChild(uVar9, i38);
                                    } else {
                                        accessibilityNodeInfoObtain.addChild(uVar9, i38);
                                    }
                                }
                                uVar.f(i38, i11);
                                i11++;
                            }
                        }
                        i12 = i413 + 1;
                        size = i414;
                        listJ = list6;
                    }
                    i13 = b0Var2.f11178n;
                    r8 = fVar.f5287a;
                    if (i7 == i13) {
                        r8.setAccessibilityFocused(true);
                        fVar.a(f4.d.f5276d);
                    } else {
                        r8.setAccessibilityFocused(false);
                        fVar.a(f4.d.f5275c);
                    }
                    hVarM = j0.m(mVar6);
                    if (hVarM != null) {
                        uVar9.getFontFamilyResolver();
                        density = uVar9.getDensity();
                        bVar = b0Var2.I;
                        String str4 = hVarM.f1353b;
                        list4 = hVarM.f1352a;
                        spannableString = new SpannableString(str4);
                        arrayList3 = hVarM.f1354c;
                        if (arrayList3 != null) {
                            size9 = arrayList3.size();
                            i32 = 0;
                            while (i32 < size9) {
                                ArrayList arrayList8 = arrayList3;
                                b3.f fVar17 = (b3.f) arrayList3.get(i32);
                                int i415 = i32;
                                b3.h0 h0Var8 = (b3.h0) fVar17.f1324a;
                                int i416 = size9;
                                i33 = fVar17.f1325b;
                                i34 = fVar17.f1326c;
                                s.u uVar11 = uVar;
                                y2.g gVar6 = gVar;
                                y2.j jVar6 = jVar;
                                jB = h0Var8.f1356a.b();
                                AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfoObtain;
                                f4.f fVar18 = fVar;
                                long j11 = h0Var8.f1357b;
                                kVar = h0Var8.f1358c;
                                iVar = h0Var8.f1359d;
                                pVar = h0Var8.f1365j;
                                i3.b bVar3 = h0Var8.k;
                                y2.m mVar8 = mVar6;
                                s.h0 h0Var9 = h0Var;
                                j5 = h0Var8.f1366l;
                                lVar = h0Var8.f1367m;
                                oVar2 = h0Var8.f1356a;
                                if (y1.q.c(jB, oVar2.b())) {
                                    oVar3 = oVar2;
                                } else {
                                    if (jB != 16) {
                                        cVar = new m3.c(jB);
                                    } else {
                                        cVar = m3.n.f8425a;
                                    }
                                    oVar3 = cVar;
                                }
                                g5.a.h0(spannableString, oVar3.b(), i33, i34);
                                spannableString3 = spannableString;
                                g5.a.k0(spannableString3, j11, density, i33, i34);
                                if (kVar == null) {
                                    if (kVar == null) {
                                        kVar2 = f3.k.f5258c;
                                    } else {
                                        kVar2 = kVar;
                                    }
                                    if (iVar != null) {
                                        i35 = iVar.f5255a;
                                    } else {
                                        i35 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(g5.a.F(kVar2, i35));
                                    i36 = 33;
                                    spannableString3.setSpan(styleSpan2, i33, i34, 33);
                                } else {
                                    if (kVar == null) {
                                        kVar2 = f3.k.f5258c;
                                    } else {
                                        kVar2 = kVar;
                                    }
                                    if (iVar != null) {
                                        i35 = iVar.f5255a;
                                    } else {
                                        i35 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(g5.a.F(kVar2, i35));
                                    i36 = 33;
                                    spannableString3.setSpan(styleSpan3, i33, i34, 33);
                                }
                                if (lVar != null) {
                                    i37 = lVar.f8423a;
                                    if ((i37 | 1) == i37) {
                                        spannableString3.setSpan(new UnderlineSpan(), i33, i34, i36);
                                    }
                                    if ((i37 | 2) == i37) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i33, i34, i36);
                                    }
                                }
                                if (pVar != null) {
                                    spannableString3.setSpan(new ScaleXSpan(pVar.f8427a), i33, i34, i36);
                                }
                                g5.a.n0(spannableString3, bVar3, i33, i34);
                                if (j5 != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(y1.h0.C(j5)), i33, i34, i36);
                                }
                                i32 = i415 + 1;
                                spannableString = spannableString3;
                                arrayList3 = arrayList8;
                                size9 = i416;
                                uVar = uVar11;
                                jVar = jVar6;
                                gVar = gVar6;
                                fVar = fVar18;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo4;
                                mVar6 = mVar8;
                                h0Var = h0Var9;
                            }
                        }
                        uVar2 = uVar;
                        mVar = mVar6;
                        h0Var2 = h0Var;
                        gVar2 = gVar;
                        jVar2 = jVar;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        fVar2 = fVar;
                        spannableString2 = spannableString;
                        int length4 = str4.length();
                        arrayList4 = u8.w.f13122a;
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size8 = list4.size();
                            for (i31 = 0; i31 < size8; i31++) {
                                Object obj5 = list4.get(i31);
                                fVar10 = (b3.f) obj5;
                                if (!(fVar10.f1324a instanceof b3.t0)) {
                                }
                            }
                        } else {
                            arrayList5 = arrayList4;
                        }
                        size3 = arrayList5.size();
                        for (i22 = 0; i22 < size3; i22++) {
                            b3.f fVar19 = (b3.f) arrayList5.get(i22);
                            t0Var = (b3.t0) fVar19.f1324a;
                            i29 = fVar19.f1325b;
                            i30 = fVar19.f1326c;
                            if (t0Var instanceof b3.t0) {
                                throw new cc.s();
                            }
                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(t0Var.f1452a).build(), i29, i30, 33);
                        }
                        int length5 = str4.length();
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size7 = list4.size();
                            for (i28 = 0; i28 < size7; i28++) {
                                Object obj6 = list4.get(i28);
                                fVar9 = (b3.f) obj6;
                                if (!(fVar9.f1324a instanceof b3.s0)) {
                                }
                            }
                        } else {
                            arrayList6 = arrayList4;
                        }
                        size4 = arrayList6.size();
                        for (i23 = 0; i23 < size4; i23++) {
                            b3.f fVar110 = (b3.f) arrayList6.get(i23);
                            s0Var = (b3.s0) fVar110.f1324a;
                            int i417 = fVar110.f1325b;
                            int i418 = fVar110.f1326c;
                            weakHashMap3 = (WeakHashMap) bVar.f12b;
                            uRLSpan2 = weakHashMap3.get(s0Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(s0Var.f1448a);
                                weakHashMap3.put(s0Var, uRLSpan2);
                            }
                            spannableString2.setSpan((URLSpan) uRLSpan2, i417, i418, 33);
                        }
                        int length6 = str4.length();
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            size6 = list4.size();
                            for (i27 = 0; i27 < size6; i27++) {
                                Object obj7 = list4.get(i27);
                                fVar8 = (b3.f) obj7;
                                if (!(fVar8.f1324a instanceof b3.n)) {
                                }
                            }
                        }
                        size5 = arrayList4.size();
                        for (i24 = 0; i24 < size5; i24++) {
                            fVar6 = (b3.f) arrayList4.get(i24);
                            i25 = fVar6.f1325b;
                            obj = fVar6.f1324a;
                            i26 = fVar6.f1326c;
                            if (i25 != i26) {
                                nVar = (b3.n) obj;
                                if (nVar instanceof b3.m) {
                                    i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    mVar3 = (b3.m) obj;
                                    fVar7 = new b3.f(i25, i26, mVar3);
                                    weakHashMap2 = (WeakHashMap) bVar.f13c;
                                    uRLSpan = weakHashMap2.get(fVar7);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(mVar3.f1389a);
                                        weakHashMap2.put(fVar7, uRLSpan);
                                    }
                                    spannableString2.setSpan((URLSpan) uRLSpan, i25, i26, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) bVar.f14d;
                                    gVar4 = weakHashMap.get(fVar6);
                                    if (gVar4 == null) {
                                        gVar4 = new j3.g(nVar);
                                        weakHashMap.put(fVar6, gVar4);
                                    }
                                    spannableString2.setSpan((ClickableSpan) gVar4, i25, i26, 33);
                                }
                            }
                        }
                        r10 = (SpannableString) b0.J(spannableString2);
                    } else {
                        b0Var2 = b0Var2;
                        uVar2 = uVar;
                        mVar = mVar6;
                        h0Var2 = h0Var;
                        gVar2 = gVar;
                        jVar2 = jVar;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        fVar2 = fVar;
                        r10 = th;
                    }
                    r8.setText(r10);
                    uVar3 = y2.r.K;
                    h0Var3 = h0Var2;
                    if (h0Var3.c(uVar3)) {
                        AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                        accessibilityNodeInfo5.setContentInvalid(true);
                        objG12 = h0Var3.g(uVar3);
                        if (objG12 == null) {
                            objG12 = th;
                        }
                        accessibilityNodeInfo5.setError((CharSequence) objG12);
                        r11 = accessibilityNodeInfo5;
                    } else {
                        r11 = accessibilityNodeInfo;
                    }
                    mVar2 = mVar;
                    strL = j0.l(mVar2, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        e4.h.f(r8, strL);
                    } else {
                        r8.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strL);
                    }
                    r11.setCheckable(j0.k(mVar2));
                    objG2 = h0Var3.g(y2.r.I);
                    if (objG2 == null) {
                        objG2 = th;
                    }
                    aVar = (a3.a) objG2;
                    if (aVar != null) {
                        if (aVar == a3.a.f28a) {
                            r8.setChecked(true);
                        } else if (aVar == a3.a.f29b) {
                            r8.setChecked(false);
                        }
                    }
                    objG3 = h0Var3.g(y2.r.H);
                    if (objG3 == null) {
                        objG3 = th;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (gVar2 == null) {
                            gVar3 = gVar2;
                            i14 = 4;
                        } else {
                            gVar3 = gVar2;
                            i14 = 4;
                            if (gVar3.f14983a == 4) {
                                r11.setSelected(zBooleanValue2);
                            }
                        }
                        r8.setChecked(zBooleanValue2);
                    } else {
                        gVar3 = gVar2;
                        i14 = 4;
                    }
                    jVar3 = jVar2;
                    if (jVar3.f15013c) {
                        objG4 = h0Var3.g(y2.r.f15050a);
                        if (objG4 == null) {
                            objG4 = th;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            r12 = (String) u8.p.m0(list);
                        } else {
                            r12 = th;
                        }
                        r11.setContentDescription(r12);
                    } else {
                        objG4 = h0Var3.g(y2.r.f15050a);
                        if (objG4 == null) {
                            objG4 = th;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            r12 = (String) u8.p.m0(list);
                        } else {
                            r12 = th;
                        }
                        r11.setContentDescription(r12);
                    }
                    objG5 = h0Var3.g(y2.r.f15073y);
                    if (objG5 == null) {
                        objG5 = th;
                    }
                    str = (String) objG5;
                    if (str != null) {
                        mVarL2 = mVar2;
                        while (true) {
                            if (mVarL2 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            jVar4 = mVarL2.f15020d;
                            uVar8 = y2.s.f15075a;
                            if (jVar4.f15011a.c(uVar8)) {
                                zBooleanValue = ((Boolean) jVar4.k(uVar8)).booleanValue();
                                break;
                            }
                            mVarL2 = mVarL2.l();
                        }
                        if (zBooleanValue) {
                            r11.setViewIdResourceName(str);
                        }
                    }
                    objG6 = h0Var3.g(y2.r.f15057h);
                    if (objG6 == null) {
                        objG6 = th;
                    }
                    if (((t8.z) objG6) == null) {
                        fVar3 = fVar2;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        r8.setHeading(true);
                        fVar3 = fVar2;
                    } else {
                        fVar3 = fVar2;
                        fVar3.f(2, true);
                    }
                    i15 = i7;
                    if (i15 != -1) {
                        iD3 = uVar2.d(mVar2.f15023g);
                        if (iD3 != -1) {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            r11.setDrawingOrder(iD3);
                        }
                    }
                    r11.setPassword(h0Var3.c(y2.r.J));
                    r11.setEditable(h0Var3.c(y2.r.M));
                    num = (Integer) y2.p.d(jVar3, y2.r.N);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    r11.setMaxTextLength(iIntValue2);
                    r11.setEnabled(j0.a(mVar2));
                    uVar4 = y2.r.k;
                    r11.setFocusable(h0Var3.c(uVar4));
                    if (r11.isFocusable()) {
                        r11.setFocused(((Boolean) jVar3.k(uVar4)).booleanValue());
                        if (r11.isFocused()) {
                            r8.addAction(2);
                            b0 b0Var4 = b0Var2;
                            b0Var4.f11179o = i15;
                            b0Var = b0Var4;
                        } else {
                            r13 = b0Var2;
                            z11 = true;
                            r8.addAction(1);
                        }
                        r8.setVisibleToUser(y2.p.e(mVar2) ^ z11);
                        a2.f.N(y2.p.d(jVar3, y2.r.f15059j));
                        r8.setClickable(false);
                        aVar2 = (y2.a) y2.p.d(jVar3, y2.i.f14987b);
                        if (aVar2 != null) {
                            boolean zA6 = i9.l.a(y2.p.d(jVar3, y2.r.H), Boolean.TRUE);
                            if (gVar3 == null) {
                                z21 = false;
                            } else {
                                z21 = true;
                            }
                            if (z21) {
                                z22 = true;
                            } else {
                                if (gVar3 == null) {
                                    z24 = false;
                                } else {
                                    z24 = true;
                                }
                                if (z24) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                            }
                            if (z22) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            r8.setClickable(z23);
                            if (j0.a(mVar2)) {
                                fVar3.a(new f4.d(16, aVar2.f14969a));
                            }
                        }
                        r8.setLongClickable(false);
                        aVar3 = (y2.a) y2.p.d(jVar3, y2.i.f14988c);
                        if (aVar3 != null) {
                            r8.setLongClickable(true);
                            if (j0.a(mVar2)) {
                                fVar3.a(new f4.d(32, aVar3.f14969a));
                            }
                        }
                        aVar4 = (y2.a) y2.p.d(jVar3, y2.i.f15000p);
                        if (aVar4 != null) {
                            fVar3.a(new f4.d(16384, aVar4.f14969a));
                        }
                        if (j0.a(mVar2)) {
                            aVar9 = (y2.a) y2.p.d(jVar3, y2.i.f14995j);
                            if (aVar9 != null) {
                                fVar3.a(new f4.d(2097152, aVar9.f14969a));
                            }
                            aVar10 = (y2.a) y2.p.d(jVar3, y2.i.f14999o);
                            if (aVar10 != null) {
                                fVar3.a(new f4.d(android.R.id.accessibilityActionImeEnter, aVar10.f14969a));
                            }
                            aVar11 = (y2.a) y2.p.d(jVar3, y2.i.f15001q);
                            if (aVar11 != null) {
                                fVar3.a(new f4.d(65536, aVar11.f14969a));
                            }
                            aVar12 = (y2.a) y2.p.d(jVar3, y2.i.f15002r);
                            if (aVar12 != null) {
                                primaryClipDescription = uVar9.getClipboardManager().f11247a.getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    fVar3.a(new f4.d(32768, aVar12.f14969a));
                                }
                            }
                        }
                        strP = b0.p(mVar2);
                        if (strP != null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            r11.setTextSelection(r13.n(mVar2), r13.m(mVar2));
                            aVar8 = (y2.a) y2.p.d(jVar3, y2.i.f14994i);
                            if (aVar8 != null) {
                                r14 = aVar8.f14969a;
                            } else {
                                r14 = th;
                            }
                            fVar3.a(new f4.d(131072, r14));
                            r8.addAction(256);
                            r8.addAction(512);
                            r8.setMovementGranularities(11);
                            list3 = (List) y2.p.d(jVar3, y2.r.f15050a);
                            if (list3 != null) {
                                z18 = true;
                            } else {
                                z18 = true;
                            }
                            if (z18) {
                                if (h0Var3.c(y2.r.E)) {
                                    V = h0Var5.v();
                                    while (true) {
                                        if (V == 0) {
                                            V = th;
                                            break;
                                        }
                                        jVarX2 = V.x();
                                        if (jVarX2 != null) {
                                            z19 = false;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z19) {
                                            break;
                                            break;
                                        }
                                        V = V.v();
                                    }
                                    if (V != 0) {
                                        jVarX = V.x();
                                        if (jVarX != null) {
                                            objG11 = jVarX.f15011a.g(uVar4);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            zA = i9.l.a(objG11, Boolean.TRUE);
                                        } else {
                                            zA = false;
                                        }
                                        if (zA) {
                                        }
                                    }
                                } else {
                                    V = h0Var5.v();
                                    while (true) {
                                        if (V == 0) {
                                            V = th;
                                            break;
                                        }
                                        jVarX2 = V.x();
                                        if (jVarX2 != null) {
                                            z19 = false;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z19) {
                                            break;
                                            break;
                                        }
                                        V = V.v();
                                    }
                                    if (V != 0) {
                                        jVarX = V.x();
                                        if (jVarX != null) {
                                            objG11 = jVarX.f15011a.g(uVar4);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            zA = i9.l.a(objG11, Boolean.TRUE);
                                        } else {
                                            zA = false;
                                        }
                                        if (zA) {
                                        }
                                    }
                                }
                                if (!z20) {
                                    r8.setMovementGranularities(r11.getMovementGranularities() | 20);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList2 = new ArrayList();
                            arrayList2.add("androidx.compose.ui.semantics.id");
                            charSequenceE = fVar3.e();
                            if (charSequenceE != null) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (!z17) {
                                arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (jVar3.c(y2.r.f15073y)) {
                                arrayList2.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (mVar2.m().c(y2.r.O)) {
                                arrayList2.add("androidx.compose.ui.semantics.shapeType");
                                arrayList2.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList2.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList2.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            mVar2.m().getClass();
                            if (Build.VERSION.SDK_INT >= 26) {
                                r8.setAvailableExtraData(arrayList2);
                            }
                        }
                        fVar4 = (y2.f) y2.p.d(mVar2.m(), y2.r.f15052c);
                        if (fVar4 != null) {
                            f10 = fVar4.f14980a;
                            jVarM2 = mVar2.m();
                            uVar7 = y2.i.f14993h;
                            if (jVarM2.c(uVar7)) {
                                fVar3.g("android.widget.SeekBar");
                            } else {
                                fVar3.g("android.widget.ProgressBar");
                            }
                            y2.f fVar111 = y2.f.f14979d;
                            if (fVar4 != y2.f.f14979d) {
                                r8.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new f4.e(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue(), f10)).f5285a);
                            }
                            if (mVar2.m().c(uVar7)) {
                                if (f10 < n3.r.i(Float.valueOf(fVar4.a().f8964b).floatValue(), Float.valueOf(fVar4.a().f8963a).floatValue())) {
                                    fVar3.a(f4.d.f5277e);
                                }
                                if (f10 > n3.r.j(Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue())) {
                                    fVar3.a(f4.d.f5278f);
                                }
                            }
                        }
                        i16 = Build.VERSION.SDK_INT;
                        if (i16 >= 24) {
                            j0.f(fVar3, mVar2);
                        }
                        n3.l.U(fVar3, mVar2);
                        n3.l.V(fVar3, mVar2);
                        hVar = (y2.h) y2.p.d(mVar2.m(), y2.r.f15068t);
                        y2.a aVar15 = (y2.a) y2.p.d(mVar2.m(), y2.i.f14989d);
                        if (hVar != null) {
                            objG9 = mVar2.k().f15011a.g(y2.r.f15055f);
                            if (objG9 == null) {
                                objG9 = th;
                            }
                            if (objG9 == null) {
                                objG10 = mVar2.k().f15011a.g(y2.r.f15054e);
                                if (objG10 == null) {
                                    objG10 = th;
                                }
                                if (objG10 != null) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = true;
                            }
                            if (!z14) {
                                fVar3.g("android.widget.HorizontalScrollView");
                            }
                            if (((Number) hVar.f14985b.invoke()).floatValue() > 0.0f) {
                                r8.setScrollable(true);
                            }
                            if (j0.a(mVar2)) {
                                zU = b0.u(hVar);
                                oVar = n3.o.f8750b;
                                if (zU) {
                                    fVar3.a(f4.d.f5277e);
                                    h0Var4 = h0Var5;
                                    if (h0Var4.f10690y == oVar) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        dVar2 = f4.d.f5280h;
                                    } else {
                                        dVar2 = f4.d.f5282j;
                                    }
                                    fVar3.a(dVar2);
                                } else {
                                    h0Var4 = h0Var5;
                                }
                                if (b0.t(hVar)) {
                                    fVar3.a(f4.d.f5278f);
                                    if (h0Var4.f10690y == oVar) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        dVar = f4.d.f5282j;
                                    } else {
                                        dVar = f4.d.f5280h;
                                    }
                                    fVar3.a(dVar);
                                }
                            }
                        }
                        hVar2 = (y2.h) y2.p.d(mVar2.m(), y2.r.f15069u);
                        if (hVar2 != null) {
                            objG7 = mVar2.k().f15011a.g(y2.r.f15055f);
                            if (objG7 == null) {
                                objG7 = th;
                            }
                            if (objG7 == null) {
                                objG8 = mVar2.k().f15011a.g(y2.r.f15054e);
                                if (objG8 == null) {
                                    objG8 = th;
                                }
                                if (objG8 != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = true;
                            }
                            if (!z13) {
                                fVar3.g("android.widget.ScrollView");
                            }
                            if (((Number) hVar2.f14985b.invoke()).floatValue() > 0.0f) {
                                r8.setScrollable(true);
                            }
                            if (j0.a(mVar2)) {
                                if (b0.u(hVar2)) {
                                    fVar3.a(f4.d.f5277e);
                                    fVar3.a(f4.d.f5281i);
                                }
                                if (b0.t(hVar2)) {
                                    fVar3.a(f4.d.f5278f);
                                    fVar3.a(f4.d.f5279g);
                                }
                            }
                        }
                        if (i16 >= 29) {
                            j0.e(fVar3, mVar2);
                        }
                        charSequence = (CharSequence) y2.p.d(mVar2.m(), y2.r.f15053d);
                        if (i16 >= 28) {
                            r8.setPaneTitle(charSequence);
                        } else {
                            r8.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (j0.a(mVar2)) {
                            aVar5 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15003s);
                            if (aVar5 != null) {
                                fVar3.a(new f4.d(262144, aVar5.f14969a));
                            }
                            aVar6 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15004t);
                            if (aVar6 != null) {
                                fVar3.a(new f4.d(524288, aVar6.f14969a));
                            }
                            aVar7 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15005u);
                            if (aVar7 != null) {
                                fVar3.a(new f4.d(1048576, aVar7.f14969a));
                            }
                            jVarM = mVar2.m();
                            uVar6 = y2.i.f15007w;
                            if (jVarM.c(uVar6)) {
                                list2 = (List) mVar2.m().k(uVar6);
                                size2 = list2.size();
                                vVar = b0.Q;
                                if (size2 < vVar.f12509b) {
                                    throw new IllegalStateException("Can't have more than " + vVar.f12509b + " custom actions for one widget");
                                }
                                s.r0 r0Var6 = new s.r0(0);
                                s.c0 c0VarA3 = s.l0.a();
                                r0Var3 = r0Var2;
                                if (r0Var3.c(i15)) {
                                    c0Var = (s.c0) r0Var3.d(i15);
                                    iArr = vVar.f12508a;
                                    i18 = vVar.f12509b;
                                    iArr2 = new int[16];
                                    i19 = 0;
                                    i20 = 0;
                                    while (i19 < i18) {
                                        int i419 = iArr[i19];
                                        int i4110 = i18;
                                        i21 = i20 + 1;
                                        s.c0 c0Var5 = c0Var;
                                        if (iArr2.length < i21) {
                                            int[] iArrCopyOf3 = Arrays.copyOf(iArr2, Math.max(i21, (iArr2.length * 3) / 2));
                                            i9.l.d(iArrCopyOf3, "copyOf(...)");
                                            iArr2 = iArrCopyOf3;
                                        }
                                        iArr2[i20] = i419;
                                        i19++;
                                        i20 = i21;
                                        i18 = i4110;
                                        c0Var = c0Var5;
                                    }
                                    c0Var2 = c0Var;
                                    arrayList = new ArrayList();
                                    if (list2.size() <= 0) {
                                        a2.f.N(list2.get(0));
                                        i9.l.b(c0Var2);
                                        throw th;
                                    }
                                    if (arrayList.size() > 0) {
                                        a2.f.N(arrayList.get(0));
                                        if (i20 > 0) {
                                            int i4111 = iArr2[0];
                                            throw th;
                                        }
                                        t.a.d("Index must be between 0 and size");
                                        throw th;
                                    }
                                } else if (list2.size() > 0) {
                                    a2.f.N(list2.get(0));
                                    vVar.b(0);
                                    throw th;
                                }
                                r13.f11185u.e(i15, r0Var6);
                                r0Var3.e(i15, c0VarA3);
                            }
                        }
                        zC = j0.c(mVar2, resources);
                        i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 28) {
                            r8.setScreenReaderFocusable(zC);
                        } else {
                            fVar3.f(1, zC);
                        }
                        iD = r13.E.d(i15);
                        if (iD != -1) {
                            iVarU2 = j0.u(uVar9.getAndroidViewsHandler$ui_release(), iD);
                            if (iVarU2 != null) {
                                if (i17 >= 22) {
                                    uVar5 = uVar9;
                                    r8.setTraversalBefore(uVar5, iD);
                                }
                                r13.e(i15, fVar3, r13.G, th);
                            } else if (i17 >= 22) {
                                r8.setTraversalBefore(iVarU2);
                            }
                            uVar5 = uVar9;
                            r13.e(i15, fVar3, r13.G, th);
                        } else {
                            uVar5 = uVar9;
                        }
                        iD2 = r13.F.d(i15);
                        if (iD2 != -1) {
                            if (i17 >= 22) {
                                r8.setTraversalAfter(iVarU);
                            }
                            r13.e(i15, fVar3, r13.H, null);
                        }
                        str2 = (String) y2.p.d(mVar2.m(), y2.s.f15076b);
                        if (str2 != null) {
                            fVar3.g(str2);
                        }
                        fVar5 = fVar3;
                        r15 = r13;
                    } else {
                        b0Var = b0Var2;
                    }
                    z11 = true;
                    r13 = b0Var;
                    r8.setVisibleToUser(y2.p.e(mVar2) ^ z11);
                    a2.f.N(y2.p.d(jVar3, y2.r.f15059j));
                    r8.setClickable(false);
                    aVar2 = (y2.a) y2.p.d(jVar3, y2.i.f14987b);
                    if (aVar2 != null) {
                        boolean zA7 = i9.l.a(y2.p.d(jVar3, y2.r.H), Boolean.TRUE);
                        if (gVar3 == null) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        if (z21) {
                            z22 = true;
                        } else {
                            if (gVar3 == null) {
                                z24 = false;
                            } else {
                                z24 = true;
                            }
                            if (z24) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                        }
                        if (z22) {
                            z23 = true;
                        } else {
                            z23 = true;
                        }
                        r8.setClickable(z23);
                        if (j0.a(mVar2)) {
                            fVar3.a(new f4.d(16, aVar2.f14969a));
                        }
                    }
                    r8.setLongClickable(false);
                    aVar3 = (y2.a) y2.p.d(jVar3, y2.i.f14988c);
                    if (aVar3 != null) {
                        r8.setLongClickable(true);
                        if (j0.a(mVar2)) {
                            fVar3.a(new f4.d(32, aVar3.f14969a));
                        }
                    }
                    aVar4 = (y2.a) y2.p.d(jVar3, y2.i.f15000p);
                    if (aVar4 != null) {
                        fVar3.a(new f4.d(16384, aVar4.f14969a));
                    }
                    if (j0.a(mVar2)) {
                        aVar9 = (y2.a) y2.p.d(jVar3, y2.i.f14995j);
                        if (aVar9 != null) {
                            fVar3.a(new f4.d(2097152, aVar9.f14969a));
                        }
                        aVar10 = (y2.a) y2.p.d(jVar3, y2.i.f14999o);
                        if (aVar10 != null) {
                            fVar3.a(new f4.d(android.R.id.accessibilityActionImeEnter, aVar10.f14969a));
                        }
                        aVar11 = (y2.a) y2.p.d(jVar3, y2.i.f15001q);
                        if (aVar11 != null) {
                            fVar3.a(new f4.d(65536, aVar11.f14969a));
                        }
                        aVar12 = (y2.a) y2.p.d(jVar3, y2.i.f15002r);
                        if (aVar12 != null) {
                            primaryClipDescription = uVar9.getClipboardManager().f11247a.getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                fVar3.a(new f4.d(32768, aVar12.f14969a));
                            }
                        }
                    }
                    strP = b0.p(mVar2);
                    if (strP != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        r11.setTextSelection(r13.n(mVar2), r13.m(mVar2));
                        aVar8 = (y2.a) y2.p.d(jVar3, y2.i.f14994i);
                        if (aVar8 != null) {
                            r14 = aVar8.f14969a;
                        } else {
                            r14 = th;
                        }
                        fVar3.a(new f4.d(131072, r14));
                        r8.addAction(256);
                        r8.addAction(512);
                        r8.setMovementGranularities(11);
                        list3 = (List) y2.p.d(jVar3, y2.r.f15050a);
                        if (list3 != null) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (z18) {
                            if (h0Var3.c(y2.r.E)) {
                                V = h0Var5.v();
                                while (true) {
                                    if (V == 0) {
                                        V = th;
                                        break;
                                    }
                                    jVarX2 = V.x();
                                    if (jVarX2 != null) {
                                        z19 = false;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        break;
                                        break;
                                    }
                                    V = V.v();
                                }
                                if (V != 0) {
                                    jVarX = V.x();
                                    if (jVarX != null) {
                                        objG11 = jVarX.f15011a.g(uVar4);
                                        if (objG11 == null) {
                                            objG11 = th;
                                        }
                                        zA = i9.l.a(objG11, Boolean.TRUE);
                                    } else {
                                        zA = false;
                                    }
                                    if (zA) {
                                    }
                                }
                            } else {
                                V = h0Var5.v();
                                while (true) {
                                    if (V == 0) {
                                        V = th;
                                        break;
                                    }
                                    jVarX2 = V.x();
                                    if (jVarX2 != null) {
                                        z19 = false;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        break;
                                        break;
                                    }
                                    V = V.v();
                                }
                                if (V != 0) {
                                    jVarX = V.x();
                                    if (jVarX != null) {
                                        objG11 = jVarX.f15011a.g(uVar4);
                                        if (objG11 == null) {
                                            objG11 = th;
                                        }
                                        zA = i9.l.a(objG11, Boolean.TRUE);
                                    } else {
                                        zA = false;
                                    }
                                    if (zA) {
                                    }
                                }
                            }
                            if (!z20) {
                                r8.setMovementGranularities(r11.getMovementGranularities() | 20);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        arrayList2 = new ArrayList();
                        arrayList2.add("androidx.compose.ui.semantics.id");
                        charSequenceE = fVar3.e();
                        if (charSequenceE != null) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (!z17) {
                            arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (jVar3.c(y2.r.f15073y)) {
                            arrayList2.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (mVar2.m().c(y2.r.O)) {
                            arrayList2.add("androidx.compose.ui.semantics.shapeType");
                            arrayList2.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList2.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList2.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        mVar2.m().getClass();
                        if (Build.VERSION.SDK_INT >= 26) {
                            r8.setAvailableExtraData(arrayList2);
                        }
                    }
                    fVar4 = (y2.f) y2.p.d(mVar2.m(), y2.r.f15052c);
                    if (fVar4 != null) {
                        f10 = fVar4.f14980a;
                        jVarM2 = mVar2.m();
                        uVar7 = y2.i.f14993h;
                        if (jVarM2.c(uVar7)) {
                            fVar3.g("android.widget.SeekBar");
                        } else {
                            fVar3.g("android.widget.ProgressBar");
                        }
                        y2.f fVar112 = y2.f.f14979d;
                        if (fVar4 != y2.f.f14979d) {
                            r8.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new f4.e(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue(), f10)).f5285a);
                        }
                        if (mVar2.m().c(uVar7)) {
                            if (f10 < n3.r.i(Float.valueOf(fVar4.a().f8964b).floatValue(), Float.valueOf(fVar4.a().f8963a).floatValue())) {
                                fVar3.a(f4.d.f5277e);
                            }
                            if (f10 > n3.r.j(Float.valueOf(fVar4.a().f8963a).floatValue(), Float.valueOf(fVar4.a().f8964b).floatValue())) {
                                fVar3.a(f4.d.f5278f);
                            }
                        }
                    }
                    i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 24) {
                        j0.f(fVar3, mVar2);
                    }
                    n3.l.U(fVar3, mVar2);
                    n3.l.V(fVar3, mVar2);
                    hVar = (y2.h) y2.p.d(mVar2.m(), y2.r.f15068t);
                    y2.a aVar16 = (y2.a) y2.p.d(mVar2.m(), y2.i.f14989d);
                    if (hVar != null) {
                        objG9 = mVar2.k().f15011a.g(y2.r.f15055f);
                        if (objG9 == null) {
                            objG9 = th;
                        }
                        if (objG9 == null) {
                            objG10 = mVar2.k().f15011a.g(y2.r.f15054e);
                            if (objG10 == null) {
                                objG10 = th;
                            }
                            if (objG10 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = true;
                        }
                        if (!z14) {
                            fVar3.g("android.widget.HorizontalScrollView");
                        }
                        if (((Number) hVar.f14985b.invoke()).floatValue() > 0.0f) {
                            r8.setScrollable(true);
                        }
                        if (j0.a(mVar2)) {
                            zU = b0.u(hVar);
                            oVar = n3.o.f8750b;
                            if (zU) {
                                fVar3.a(f4.d.f5277e);
                                h0Var4 = h0Var5;
                                if (h0Var4.f10690y == oVar) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    dVar2 = f4.d.f5282j;
                                } else {
                                    dVar2 = f4.d.f5280h;
                                }
                                fVar3.a(dVar2);
                            } else {
                                h0Var4 = h0Var5;
                            }
                            if (b0.t(hVar)) {
                                fVar3.a(f4.d.f5278f);
                                if (h0Var4.f10690y == oVar) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    dVar = f4.d.f5280h;
                                } else {
                                    dVar = f4.d.f5282j;
                                }
                                fVar3.a(dVar);
                            }
                        }
                    }
                    hVar2 = (y2.h) y2.p.d(mVar2.m(), y2.r.f15069u);
                    if (hVar2 != null) {
                        objG7 = mVar2.k().f15011a.g(y2.r.f15055f);
                        if (objG7 == null) {
                            objG7 = th;
                        }
                        if (objG7 == null) {
                            objG8 = mVar2.k().f15011a.g(y2.r.f15054e);
                            if (objG8 == null) {
                                objG8 = th;
                            }
                            if (objG8 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = true;
                        }
                        if (!z13) {
                            fVar3.g("android.widget.ScrollView");
                        }
                        if (((Number) hVar2.f14985b.invoke()).floatValue() > 0.0f) {
                            r8.setScrollable(true);
                        }
                        if (j0.a(mVar2)) {
                            if (b0.u(hVar2)) {
                                fVar3.a(f4.d.f5277e);
                                fVar3.a(f4.d.f5281i);
                            }
                            if (b0.t(hVar2)) {
                                fVar3.a(f4.d.f5278f);
                                fVar3.a(f4.d.f5279g);
                            }
                        }
                    }
                    if (i16 >= 29) {
                        j0.e(fVar3, mVar2);
                    }
                    charSequence = (CharSequence) y2.p.d(mVar2.m(), y2.r.f15053d);
                    if (i16 >= 28) {
                        r8.setPaneTitle(charSequence);
                    } else {
                        r8.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (j0.a(mVar2)) {
                        aVar5 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15003s);
                        if (aVar5 != null) {
                            fVar3.a(new f4.d(262144, aVar5.f14969a));
                        }
                        aVar6 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15004t);
                        if (aVar6 != null) {
                            fVar3.a(new f4.d(524288, aVar6.f14969a));
                        }
                        aVar7 = (y2.a) y2.p.d(mVar2.m(), y2.i.f15005u);
                        if (aVar7 != null) {
                            fVar3.a(new f4.d(1048576, aVar7.f14969a));
                        }
                        jVarM = mVar2.m();
                        uVar6 = y2.i.f15007w;
                        if (jVarM.c(uVar6)) {
                            list2 = (List) mVar2.m().k(uVar6);
                            size2 = list2.size();
                            vVar = b0.Q;
                            if (size2 < vVar.f12509b) {
                                throw new IllegalStateException("Can't have more than " + vVar.f12509b + " custom actions for one widget");
                            }
                            s.r0 r0Var7 = new s.r0(0);
                            s.c0 c0VarA4 = s.l0.a();
                            r0Var3 = r0Var2;
                            if (r0Var3.c(i15)) {
                                c0Var = (s.c0) r0Var3.d(i15);
                                iArr = vVar.f12508a;
                                i18 = vVar.f12509b;
                                iArr2 = new int[16];
                                i19 = 0;
                                i20 = 0;
                                while (i19 < i18) {
                                    int i4112 = iArr[i19];
                                    int i4113 = i18;
                                    i21 = i20 + 1;
                                    s.c0 c0Var6 = c0Var;
                                    if (iArr2.length < i21) {
                                        int[] iArrCopyOf4 = Arrays.copyOf(iArr2, Math.max(i21, (iArr2.length * 3) / 2));
                                        i9.l.d(iArrCopyOf4, "copyOf(...)");
                                        iArr2 = iArrCopyOf4;
                                    }
                                    iArr2[i20] = i4112;
                                    i19++;
                                    i20 = i21;
                                    i18 = i4113;
                                    c0Var = c0Var6;
                                }
                                c0Var2 = c0Var;
                                arrayList = new ArrayList();
                                if (list2.size() <= 0) {
                                    a2.f.N(list2.get(0));
                                    i9.l.b(c0Var2);
                                    throw th;
                                }
                                if (arrayList.size() > 0) {
                                    a2.f.N(arrayList.get(0));
                                    if (i20 > 0) {
                                        int i4114 = iArr2[0];
                                        throw th;
                                    }
                                    t.a.d("Index must be between 0 and size");
                                    throw th;
                                }
                            } else if (list2.size() > 0) {
                                a2.f.N(list2.get(0));
                                vVar.b(0);
                                throw th;
                            }
                            r13.f11185u.e(i15, r0Var7);
                            r0Var3.e(i15, c0VarA4);
                        }
                    }
                    zC = j0.c(mVar2, resources);
                    i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 28) {
                        r8.setScreenReaderFocusable(zC);
                    } else {
                        fVar3.f(1, zC);
                    }
                    iD = r13.E.d(i15);
                    if (iD != -1) {
                        iVarU2 = j0.u(uVar9.getAndroidViewsHandler$ui_release(), iD);
                        if (iVarU2 != null) {
                            if (i17 >= 22) {
                                uVar5 = uVar9;
                                r8.setTraversalBefore(uVar5, iD);
                            }
                            r13.e(i15, fVar3, r13.G, th);
                        } else if (i17 >= 22) {
                            r8.setTraversalBefore(iVarU2);
                        }
                        uVar5 = uVar9;
                        r13.e(i15, fVar3, r13.G, th);
                    } else {
                        uVar5 = uVar9;
                    }
                    iD2 = r13.F.d(i15);
                    if (iD2 != -1) {
                        if (i17 >= 22) {
                            r8.setTraversalAfter(iVarU);
                        }
                        r13.e(i15, fVar3, r13.H, null);
                    }
                    str2 = (String) y2.p.d(mVar2.m(), y2.s.f15076b);
                    if (str2 != null) {
                        fVar3.g(str2);
                    }
                    fVar5 = fVar3;
                    r15 = r13;
                } else {
                    i15 = i7;
                    r15 = b0Var2;
                    fVar5 = null;
                }
            }
        }
        if (r15.f11182r) {
            if (i15 == r15.f11178n) {
                r15.f11180p = fVar5;
            }
            if (i15 == r15.f11179o) {
                r15.f11181q = fVar5;
            }
        }
        return fVar5;
    }

    @Override // a2.d
    public final f4.f n(int i7) {
        b0 b0Var = this.f11505c;
        if (i7 != 1) {
            if (i7 == 2) {
                return k(b0Var.f11178n);
            }
            throw new IllegalArgumentException(a2.f.E(i7, "Unknown focus type: "));
        }
        int i10 = b0Var.f11179o;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return k(i10);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x023b  */
    /* JADX WARN: Code duplicated, block: B:524:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:536:0x0707  */
    /* JADX WARN: Code duplicated, block: B:538:0x070b  */
    /* JADX WARN: Code duplicated, block: B:540:0x071f  */
    /* JADX WARN: Code duplicated, block: B:542:0x0723  */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x01a9, code lost:
    
        r1 = null;
     */
    @Override // a2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(int r21, int r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.x.t(int, int, android.os.Bundle):boolean");
    }
}
