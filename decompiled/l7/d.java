package l7;

import a9.i;
import android.media.AudioRecord;
import cc.b0;
import cc.y;
import com.baidu.carlife.sdk.util.Logger;
import h9.n;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, y8.c cVar) {
        super(2, cVar);
        this.f8083b = eVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        d dVar = new d(this.f8083b, cVar);
        dVar.f8082a = obj;
        return dVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((y) obj, (y8.c) obj2);
        z zVar = z.f12851a;
        dVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        AudioRecord audioRecord;
        t8.a.e(obj);
        y yVar = (y) this.f8082a;
        byte[] bArr = new byte[1024];
        try {
            AudioRecord audioRecord2 = this.f8083b.f8086c;
            if (audioRecord2 != null) {
                audioRecord2.startRecording();
            }
            this.f8083b.f8088e = true;
            c cVar2 = this.f8083b.f8085b;
            if (cVar2 != null) {
                cVar2.f8081c = true;
            }
            while (b0.q(yVar) && this.f8083b.f8088e && (audioRecord = this.f8083b.f8086c) != null) {
                int i7 = audioRecord.read(bArr, 0, 1024);
                if (i7 > 0) {
                    c cVar3 = this.f8083b.f8085b;
                    if (cVar3 != null && i7 > 0) {
                        cVar3.f8080b.c(bArr, 0, i7);
                    }
                } else if (i7 == -3 || i7 == -2) {
                    Logger.INSTANCE.e("CarLife_Vehicle", "【录音数据】录音读取错误: " + i7);
                    break;
                }
            }
            try {
                AudioRecord audioRecord3 = this.f8083b.f8086c;
                if (audioRecord3 != null) {
                    audioRecord3.stop();
                }
            } catch (IllegalStateException e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【录音数据】停止录音异常: ", e7.getMessage()));
            }
            AudioRecord audioRecord4 = this.f8083b.f8086c;
            if (audioRecord4 != null) {
                audioRecord4.release();
            }
            e eVar = this.f8083b;
            eVar.f8086c = null;
            cVar = eVar.f8085b;
            if (cVar != null) {
                cVar.f8081c = false;
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【录音数据】录音异常: " + e10.getMessage(), e10);
            try {
                AudioRecord audioRecord5 = this.f8083b.f8086c;
                if (audioRecord5 != null) {
                    audioRecord5.stop();
                }
            } catch (IllegalStateException e11) {
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【录音数据】停止录音异常: ", e11.getMessage()));
            }
            AudioRecord audioRecord6 = this.f8083b.f8086c;
            if (audioRecord6 != null) {
                audioRecord6.release();
            }
            e eVar2 = this.f8083b;
            eVar2.f8086c = null;
            cVar = eVar2.f8085b;
            if (cVar != null) {
            }
        } finally {
            try {
                AudioRecord audioRecord7 = this.f8083b.f8086c;
                if (audioRecord7 != null) {
                    audioRecord7.stop();
                }
            } catch (IllegalStateException e12) {
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【录音数据】停止录音异常: ", e12.getMessage()));
            }
            AudioRecord audioRecord8 = this.f8083b.f8086c;
            if (audioRecord8 != null) {
                audioRecord8.release();
            }
            e eVar3 = this.f8083b;
            eVar3.f8086c = null;
            c cVar4 = eVar3.f8085b;
            if (cVar4 != null) {
                cVar4.f8081c = false;
            }
            this.f8083b.f8088e = false;
        }
        return z.f12851a;
    }
}
