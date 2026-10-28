package androidx.media;

import a2.f;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1094a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1095b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1096c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1097d = -1;

    public final boolean equals(Object obj) {
        int i7;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1095b == audioAttributesImplBase.f1095b) {
            int i10 = this.f1096c;
            int i11 = audioAttributesImplBase.f1096c;
            int i12 = audioAttributesImplBase.f1097d;
            if (i12 == -1) {
                int i13 = audioAttributesImplBase.f1094a;
                int i14 = AudioAttributesCompat.f1090b;
                if ((i11 & 1) != 1) {
                    i7 = 4;
                    if ((i11 & 4) != 4) {
                        switch (i13) {
                            case 2:
                                i7 = 0;
                                break;
                            case 3:
                                i7 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i7 = 5;
                                break;
                            case 6:
                                i7 = 2;
                                break;
                            case 11:
                                i7 = 10;
                                break;
                            case 12:
                            default:
                                i7 = 3;
                                break;
                            case 13:
                                i7 = 1;
                                break;
                        }
                    } else {
                        i7 = 6;
                    }
                } else {
                    i7 = 7;
                }
            } else {
                i7 = i12;
            }
            if (i7 == 6) {
                i11 |= 4;
            } else if (i7 == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f1094a == audioAttributesImplBase.f1094a && this.f1097d == i12) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1095b), Integer.valueOf(this.f1096c), Integer.valueOf(this.f1094a), Integer.valueOf(this.f1097d)});
    }

    public final String toString() {
        String strE;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1097d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f1097d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i7 = this.f1094a;
        int i10 = AudioAttributesCompat.f1090b;
        switch (i7) {
            case 0:
                strE = "USAGE_UNKNOWN";
                break;
            case 1:
                strE = "USAGE_MEDIA";
                break;
            case 2:
                strE = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strE = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strE = "USAGE_ALARM";
                break;
            case 5:
                strE = "USAGE_NOTIFICATION";
                break;
            case 6:
                strE = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strE = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strE = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strE = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strE = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strE = "USAGE_GAME";
                break;
            case 15:
            default:
                strE = f.E(i7, "unknown usage ");
                break;
            case 16:
                strE = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strE);
        sb2.append(" content=");
        sb2.append(this.f1095b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f1096c).toUpperCase());
        return sb2.toString();
    }
}
