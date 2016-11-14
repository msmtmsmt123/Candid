package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CountryPicker */
public class akf extends DialogFragment implements Comparator<akh> {
    private EditText a;
    private ListView b;
    private ake c;
    private List<akh> d;
    private List<akh> e;
    private akg f;
    private Context g;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((akh) obj, (akh) obj2);
    }

    public void a(akg listener) {
        this.f = listener;
    }

    private List<akh> a() {
        if (this.d == null) {
            try {
                this.d = new ArrayList();
                JSONArray countryArray = new JSONArray(akf.b());
                for (int i = 0; i < countryArray.length(); i++) {
                    JSONObject jsonObject = countryArray.getJSONObject(i);
                    String countryName = jsonObject.getString("name");
                    String countryDialCode = jsonObject.getString("dial_code");
                    String countryCode = jsonObject.getString("code");
                    akh country = new akh();
                    country.b(countryCode);
                    country.c(countryName);
                    country.a(countryDialCode);
                    this.d.add(country);
                }
                Collections.sort(this.d, this);
                this.e = new ArrayList();
                this.e.addAll(this.d);
                return this.d;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static String b() throws IOException {
        return new String(Base64.decode("Ww0KICB7DQogICAgIm5hbWUiOiAiQWZnaGFuaXN0YW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzkzIiwNCiAgICAiY29kZSI6ICJBRiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkFsYmFuaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM1NSIsDQogICAgImNvZGUiOiAiQUwiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJBbGdlcmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMTMiLA0KICAgICJjb2RlIjogIkRaIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQW1lcmljYW5TYW1vYSIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiQVMiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJBbmRvcnJhIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNzYiLA0KICAgICJjb2RlIjogIkFEIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQW5nb2xhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNDQiLA0KICAgICJjb2RlIjogIkFPIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQW5ndWlsbGEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIkFJIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQW50YXJjdGljYSIsDQogICAgImRpYWxfY29kZSI6ICIrNjcyIiwNCiAgICAiY29kZSI6ICJBUSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkFudGlndWEgYW5kIEJhcmJ1ZGEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIkFHIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQXJnZW50aW5hIiwNCiAgICAiZGlhbF9jb2RlIjogIis1NCIsDQogICAgImNvZGUiOiAiQVIiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJBcm1lbmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNzQiLA0KICAgICJjb2RlIjogIkFNIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQXJ1YmEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI5NyIsDQogICAgImNvZGUiOiAiQVciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJBdXN0cmFsaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzYxIiwNCiAgICAiY29kZSI6ICJBVSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkF1c3RyaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzQzIiwNCiAgICAiY29kZSI6ICJBVCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkF6ZXJiYWlqYW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzk5NCIsDQogICAgImNvZGUiOiAiQVoiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJCYWhhbWFzIiwNCiAgICAiZGlhbF9jb2RlIjogIisxIiwNCiAgICAiY29kZSI6ICJCUyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkJhaHJhaW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzk3MyIsDQogICAgImNvZGUiOiAiQkgiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJCYW5nbGFkZXNoIiwNCiAgICAiZGlhbF9jb2RlIjogIis4ODAiLA0KICAgICJjb2RlIjogIkJEIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQmFyYmFkb3MiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIkJCIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQmVsYXJ1cyIsDQogICAgImRpYWxfY29kZSI6ICIrMzc1IiwNCiAgICAiY29kZSI6ICJCWSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkJlbGdpdW0iLA0KICAgICJkaWFsX2NvZGUiOiAiKzMyIiwNCiAgICAiY29kZSI6ICJCRSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkJlbGl6ZSIsDQogICAgImRpYWxfY29kZSI6ICIrNTAxIiwNCiAgICAiY29kZSI6ICJCWiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkJlbmluIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMjkiLA0KICAgICJjb2RlIjogIkJKIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQmVybXVkYSIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiQk0iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJCaHV0YW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzk3NSIsDQogICAgImNvZGUiOiAiQlQiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJCb2xpdmlhLCBQbHVyaW5hdGlvbmFsIFN0YXRlIG9mIiwNCiAgICAiZGlhbF9jb2RlIjogIis1OTEiLA0KICAgICJjb2RlIjogIkJPIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQm9zbmlhIGFuZCBIZXJ6ZWdvdmluYSIsDQogICAgImRpYWxfY29kZSI6ICIrMzg3IiwNCiAgICAiY29kZSI6ICJCQSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkJvdHN3YW5hIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNjciLA0KICAgICJjb2RlIjogIkJXIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQnJhemlsIiwNCiAgICAiZGlhbF9jb2RlIjogIis1NSIsDQogICAgImNvZGUiOiAiQlIiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJCcml0aXNoIEluZGlhbiBPY2VhbiBUZXJyaXRvcnkiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI0NiIsDQogICAgImNvZGUiOiAiSU8iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJCcnVuZWkgRGFydXNzYWxhbSIsDQogICAgImRpYWxfY29kZSI6ICIrNjczIiwNCiAgICAiY29kZSI6ICJCTiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkJ1bGdhcmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNTkiLA0KICAgICJjb2RlIjogIkJHIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQnVya2luYSBGYXNvIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMjYiLA0KICAgICJjb2RlIjogIkJGIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQnVydW5kaSIsDQogICAgImRpYWxfY29kZSI6ICIrMjU3IiwNCiAgICAiY29kZSI6ICJCSSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNhbWJvZGlhIiwNCiAgICAiZGlhbF9jb2RlIjogIis4NTUiLA0KICAgICJjb2RlIjogIktIIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQ2FtZXJvb24iLA0KICAgICJkaWFsX2NvZGUiOiAiKzIzNyIsDQogICAgImNvZGUiOiAiQ00iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJDYW5hZGEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIkNBIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQ2FwZSBWZXJkZSIsDQogICAgImRpYWxfY29kZSI6ICIrMjM4IiwNCiAgICAiY29kZSI6ICJDViINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNheW1hbiBJc2xhbmRzIiwNCiAgICAiZGlhbF9jb2RlIjogIisgMzQ1IiwNCiAgICAiY29kZSI6ICJLWSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNlbnRyYWwgQWZyaWNhbiBSZXB1YmxpYyIsDQogICAgImRpYWxfY29kZSI6ICIrMjM2IiwNCiAgICAiY29kZSI6ICJDRiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNoYWQiLA0KICAgICJkaWFsX2NvZGUiOiAiKzIzNSIsDQogICAgImNvZGUiOiAiVEQiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJDaGlsZSIsDQogICAgImRpYWxfY29kZSI6ICIrNTYiLA0KICAgICJjb2RlIjogIkNMIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQ2hpbmEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzg2IiwNCiAgICAiY29kZSI6ICJDTiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNocmlzdG1hcyBJc2xhbmQiLA0KICAgICJkaWFsX2NvZGUiOiAiKzYxIiwNCiAgICAiY29kZSI6ICJDWCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNvY29zIChLZWVsaW5nKSBJc2xhbmRzIiwNCiAgICAiZGlhbF9jb2RlIjogIis2MSIsDQogICAgImNvZGUiOiAiQ0MiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJDb2xvbWJpYSIsDQogICAgImRpYWxfY29kZSI6ICIrNTciLA0KICAgICJjb2RlIjogIkNPIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQ29tb3JvcyIsDQogICAgImRpYWxfY29kZSI6ICIrMjY5IiwNCiAgICAiY29kZSI6ICJLTSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNvbmdvIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNDIiLA0KICAgICJjb2RlIjogIkNHIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQ29uZ28sIFRoZSBEZW1vY3JhdGljIFJlcHVibGljIG9mIHRoZSIsDQogICAgImRpYWxfY29kZSI6ICIrMjQzIiwNCiAgICAiY29kZSI6ICJDRCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNvb2sgSXNsYW5kcyIsDQogICAgImRpYWxfY29kZSI6ICIrNjgyIiwNCiAgICAiY29kZSI6ICJDSyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkNvc3RhIFJpY2EiLA0KICAgICJkaWFsX2NvZGUiOiAiKzUwNiIsDQogICAgImNvZGUiOiAiQ1IiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJDb3RlIGQnSXZvaXJlIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMjUiLA0KICAgICJjb2RlIjogIkNJIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiQ3JvYXRpYSIsDQogICAgImRpYWxfY29kZSI6ICIrMzg1IiwNCiAgICAiY29kZSI6ICJIUiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkN1YmEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzUzIiwNCiAgICAiY29kZSI6ICJDVSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkN5cHJ1cyIsDQogICAgImRpYWxfY29kZSI6ICIrMzU3IiwNCiAgICAiY29kZSI6ICJDWSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkN6ZWNoIFJlcHVibGljIiwNCiAgICAiZGlhbF9jb2RlIjogIis0MjAiLA0KICAgICJjb2RlIjogIkNaIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiRGVubWFyayIsDQogICAgImRpYWxfY29kZSI6ICIrNDUiLA0KICAgICJjb2RlIjogIkRLIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiRGppYm91dGkiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI1MyIsDQogICAgImNvZGUiOiAiREoiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJEb21pbmljYSIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiRE0iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJEb21pbmljYW4gUmVwdWJsaWMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIkRPIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiRWN1YWRvciIsDQogICAgImRpYWxfY29kZSI6ICIrNTkzIiwNCiAgICAiY29kZSI6ICJFQyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkVneXB0IiwNCiAgICAiZGlhbF9jb2RlIjogIisyMCIsDQogICAgImNvZGUiOiAiRUciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJFbCBTYWx2YWRvciIsDQogICAgImRpYWxfY29kZSI6ICIrNTAzIiwNCiAgICAiY29kZSI6ICJTViINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkVxdWF0b3JpYWwgR3VpbmVhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNDAiLA0KICAgICJjb2RlIjogIkdRIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiRXJpdHJlYSIsDQogICAgImRpYWxfY29kZSI6ICIrMjkxIiwNCiAgICAiY29kZSI6ICJFUiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkVzdG9uaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM3MiIsDQogICAgImNvZGUiOiAiRUUiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJFdGhpb3BpYSIsDQogICAgImRpYWxfY29kZSI6ICIrMjUxIiwNCiAgICAiY29kZSI6ICJFVCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkZhbGtsYW5kIElzbGFuZHMgKE1hbHZpbmFzKSIsDQogICAgImRpYWxfY29kZSI6ICIrNTAwIiwNCiAgICAiY29kZSI6ICJGSyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkZhcm9lIElzbGFuZHMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI5OCIsDQogICAgImNvZGUiOiAiRk8iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJGaWppIiwNCiAgICAiZGlhbF9jb2RlIjogIis2NzkiLA0KICAgICJjb2RlIjogIkZKIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiRmlubGFuZCIsDQogICAgImRpYWxfY29kZSI6ICIrMzU4IiwNCiAgICAiY29kZSI6ICJGSSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkZyYW5jZSIsDQogICAgImRpYWxfY29kZSI6ICIrMzMiLA0KICAgICJjb2RlIjogIkZSIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiRnJlbmNoIEd1aWFuYSIsDQogICAgImRpYWxfY29kZSI6ICIrNTk0IiwNCiAgICAiY29kZSI6ICJHRiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkZyZW5jaCBQb2x5bmVzaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzY4OSIsDQogICAgImNvZGUiOiAiUEYiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJHYWJvbiIsDQogICAgImRpYWxfY29kZSI6ICIrMjQxIiwNCiAgICAiY29kZSI6ICJHQSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkdhbWJpYSIsDQogICAgImRpYWxfY29kZSI6ICIrMjIwIiwNCiAgICAiY29kZSI6ICJHTSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkdlb3JnaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzk5NSIsDQogICAgImNvZGUiOiAiR0UiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJHZXJtYW55IiwNCiAgICAiZGlhbF9jb2RlIjogIis0OSIsDQogICAgImNvZGUiOiAiREUiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJHaGFuYSIsDQogICAgImRpYWxfY29kZSI6ICIrMjMzIiwNCiAgICAiY29kZSI6ICJHSCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkdpYnJhbHRhciIsDQogICAgImRpYWxfY29kZSI6ICIrMzUwIiwNCiAgICAiY29kZSI6ICJHSSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkdyZWVjZSIsDQogICAgImRpYWxfY29kZSI6ICIrMzAiLA0KICAgICJjb2RlIjogIkdSIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiR3JlZW5sYW5kIiwNCiAgICAiZGlhbF9jb2RlIjogIisyOTkiLA0KICAgICJjb2RlIjogIkdMIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiR3JlbmFkYSIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiR0QiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJHdWFkZWxvdXBlIiwNCiAgICAiZGlhbF9jb2RlIjogIis1OTAiLA0KICAgICJjb2RlIjogIkdQIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiR3VhbSIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiR1UiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJHdWF0ZW1hbGEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzUwMiIsDQogICAgImNvZGUiOiAiR1QiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJHdWVybnNleSIsDQogICAgImRpYWxfY29kZSI6ICIrNDQiLA0KICAgICJjb2RlIjogIkdHIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiR3VpbmVhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMjQiLA0KICAgICJjb2RlIjogIkdOIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiR3VpbmVhLUJpc3NhdSIsDQogICAgImRpYWxfY29kZSI6ICIrMjQ1IiwNCiAgICAiY29kZSI6ICJHVyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkd1eWFuYSIsDQogICAgImRpYWxfY29kZSI6ICIrNTk1IiwNCiAgICAiY29kZSI6ICJHWSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkhhaXRpIiwNCiAgICAiZGlhbF9jb2RlIjogIis1MDkiLA0KICAgICJjb2RlIjogIkhUIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiSG9seSBTZWUgKFZhdGljYW4gQ2l0eSBTdGF0ZSkiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM3OSIsDQogICAgImNvZGUiOiAiVkEiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJIb25kdXJhcyIsDQogICAgImRpYWxfY29kZSI6ICIrNTA0IiwNCiAgICAiY29kZSI6ICJITiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkhvbmcgS29uZyIsDQogICAgImRpYWxfY29kZSI6ICIrODUyIiwNCiAgICAiY29kZSI6ICJISyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkh1bmdhcnkiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM2IiwNCiAgICAiY29kZSI6ICJIVSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkljZWxhbmQiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM1NCIsDQogICAgImNvZGUiOiAiSVMiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJJbmRpYSIsDQogICAgImRpYWxfY29kZSI6ICIrOTEiLA0KICAgICJjb2RlIjogIklOIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiSW5kb25lc2lhIiwNCiAgICAiZGlhbF9jb2RlIjogIis2MiIsDQogICAgImNvZGUiOiAiSUQiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJJcmFuLCBJc2xhbWljIFJlcHVibGljIG9mIiwNCiAgICAiZGlhbF9jb2RlIjogIis5OCIsDQogICAgImNvZGUiOiAiSVIiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJJcmFxIiwNCiAgICAiZGlhbF9jb2RlIjogIis5NjQiLA0KICAgICJjb2RlIjogIklRIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiSXJlbGFuZCIsDQogICAgImRpYWxfY29kZSI6ICIrMzUzIiwNCiAgICAiY29kZSI6ICJJRSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIklzbGUgb2YgTWFuIiwNCiAgICAiZGlhbF9jb2RlIjogIis0NCIsDQogICAgImNvZGUiOiAiSU0iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJJc3JhZWwiLA0KICAgICJkaWFsX2NvZGUiOiAiKzk3MiIsDQogICAgImNvZGUiOiAiSUwiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJJdGFseSIsDQogICAgImRpYWxfY29kZSI6ICIrMzkiLA0KICAgICJjb2RlIjogIklUIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiSmFtYWljYSIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiSk0iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJKYXBhbiIsDQogICAgImRpYWxfY29kZSI6ICIrODEiLA0KICAgICJjb2RlIjogIkpQIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiSmVyc2V5IiwNCiAgICAiZGlhbF9jb2RlIjogIis0NCIsDQogICAgImNvZGUiOiAiSkUiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJKb3JkYW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzk2MiIsDQogICAgImNvZGUiOiAiSk8iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJLYXpha2hzdGFuIiwNCiAgICAiZGlhbF9jb2RlIjogIis3IiwNCiAgICAiY29kZSI6ICJLWiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIktlbnlhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNTQiLA0KICAgICJjb2RlIjogIktFIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiS2lyaWJhdGkiLA0KICAgICJkaWFsX2NvZGUiOiAiKzY4NiIsDQogICAgImNvZGUiOiAiS0kiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJLb3JlYSwgRGVtb2NyYXRpYyBQZW9wbGUncyBSZXB1YmxpYyBvZiIsDQogICAgImRpYWxfY29kZSI6ICIrODUwIiwNCiAgICAiY29kZSI6ICJLUCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIktvcmVhLCBSZXB1YmxpYyBvZiIsDQogICAgImRpYWxfY29kZSI6ICIrODIiLA0KICAgICJjb2RlIjogIktSIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiS3V3YWl0IiwNCiAgICAiZGlhbF9jb2RlIjogIis5NjUiLA0KICAgICJjb2RlIjogIktXIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiS3lyZ3l6c3RhbiIsDQogICAgImRpYWxfY29kZSI6ICIrOTk2IiwNCiAgICAiY29kZSI6ICJLRyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkxhbyBQZW9wbGUncyBEZW1vY3JhdGljIFJlcHVibGljIiwNCiAgICAiZGlhbF9jb2RlIjogIis4NTYiLA0KICAgICJjb2RlIjogIkxBIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTGF0dmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNzEiLA0KICAgICJjb2RlIjogIkxWIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTGViYW5vbiIsDQogICAgImRpYWxfY29kZSI6ICIrOTYxIiwNCiAgICAiY29kZSI6ICJMQiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkxlc290aG8iLA0KICAgICJkaWFsX2NvZGUiOiAiKzI2NiIsDQogICAgImNvZGUiOiAiTFMiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJMaWJlcmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMzEiLA0KICAgICJjb2RlIjogIkxSIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTGlieWFuIEFyYWIgSmFtYWhpcml5YSIsDQogICAgImRpYWxfY29kZSI6ICIrMjE4IiwNCiAgICAiY29kZSI6ICJMWSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIkxpZWNodGVuc3RlaW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzQyMyIsDQogICAgImNvZGUiOiAiTEkiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJMaXRodWFuaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM3MCIsDQogICAgImNvZGUiOiAiTFQiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJMdXhlbWJvdXJnIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNTIiLA0KICAgICJjb2RlIjogIkxVIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWFjYW8iLA0KICAgICJkaWFsX2NvZGUiOiAiKzg1MyIsDQogICAgImNvZGUiOiAiTU8iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJNYWNlZG9uaWEsIFRoZSBGb3JtZXIgWXVnb3NsYXYgUmVwdWJsaWMgb2YiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM4OSIsDQogICAgImNvZGUiOiAiTUsiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJNYWRhZ2FzY2FyIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNjEiLA0KICAgICJjb2RlIjogIk1HIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWFsYXdpIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNjUiLA0KICAgICJjb2RlIjogIk1XIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWFsYXlzaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzYwIiwNCiAgICAiY29kZSI6ICJNWSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk1hbGRpdmVzIiwNCiAgICAiZGlhbF9jb2RlIjogIis5NjAiLA0KICAgICJjb2RlIjogIk1WIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWFsaSIsDQogICAgImRpYWxfY29kZSI6ICIrMjIzIiwNCiAgICAiY29kZSI6ICJNTCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk1hbHRhIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNTYiLA0KICAgICJjb2RlIjogIk1UIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWFyc2hhbGwgSXNsYW5kcyIsDQogICAgImRpYWxfY29kZSI6ICIrNjkyIiwNCiAgICAiY29kZSI6ICJNSCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk1hcnRpbmlxdWUiLA0KICAgICJkaWFsX2NvZGUiOiAiKzU5NiIsDQogICAgImNvZGUiOiAiTVEiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJNYXVyaXRhbmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMjIiLA0KICAgICJjb2RlIjogIk1SIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWF1cml0aXVzIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMzAiLA0KICAgICJjb2RlIjogIk1VIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWF5b3R0ZSIsDQogICAgImRpYWxfY29kZSI6ICIrMjYyIiwNCiAgICAiY29kZSI6ICJZVCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk1leGljbyIsDQogICAgImRpYWxfY29kZSI6ICIrNTIiLA0KICAgICJjb2RlIjogIk1YIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTWljcm9uZXNpYSwgRmVkZXJhdGVkIFN0YXRlcyBvZiIsDQogICAgImRpYWxfY29kZSI6ICIrNjkxIiwNCiAgICAiY29kZSI6ICJGTSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk1vbGRvdmEsIFJlcHVibGljIG9mIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNzMiLA0KICAgICJjb2RlIjogIk1EIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTW9uYWNvIiwNCiAgICAiZGlhbF9jb2RlIjogIiszNzciLA0KICAgICJjb2RlIjogIk1DIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTW9uZ29saWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzk3NiIsDQogICAgImNvZGUiOiAiTU4iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJNb250ZW5lZ3JvIiwNCiAgICAiZGlhbF9jb2RlIjogIiszODIiLA0KICAgICJjb2RlIjogIk1FIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTW9udHNlcnJhdCIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiTVMiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJNb3JvY2NvIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMTIiLA0KICAgICJjb2RlIjogIk1BIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTW96YW1iaXF1ZSIsDQogICAgImRpYWxfY29kZSI6ICIrMjU4IiwNCiAgICAiY29kZSI6ICJNWiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk15YW5tYXIiLA0KICAgICJkaWFsX2NvZGUiOiAiKzk1IiwNCiAgICAiY29kZSI6ICJNTSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk5hbWliaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI2NCIsDQogICAgImNvZGUiOiAiTkEiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJOYXVydSIsDQogICAgImRpYWxfY29kZSI6ICIrNjc0IiwNCiAgICAiY29kZSI6ICJOUiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk5lcGFsIiwNCiAgICAiZGlhbF9jb2RlIjogIis5NzciLA0KICAgICJjb2RlIjogIk5QIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTmV0aGVybGFuZHMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzMxIiwNCiAgICAiY29kZSI6ICJOTCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk5ldGhlcmxhbmRzIEFudGlsbGVzIiwNCiAgICAiZGlhbF9jb2RlIjogIis1OTkiLA0KICAgICJjb2RlIjogIkFOIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTmV3IENhbGVkb25pYSIsDQogICAgImRpYWxfY29kZSI6ICIrNjg3IiwNCiAgICAiY29kZSI6ICJOQyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk5ldyBaZWFsYW5kIiwNCiAgICAiZGlhbF9jb2RlIjogIis2NCIsDQogICAgImNvZGUiOiAiTloiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJOaWNhcmFndWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzUwNSIsDQogICAgImNvZGUiOiAiTkkiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJOaWdlciIsDQogICAgImRpYWxfY29kZSI6ICIrMjI3IiwNCiAgICAiY29kZSI6ICJORSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIk5pZ2VyaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzIzNCIsDQogICAgImNvZGUiOiAiTkciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJOaXVlIiwNCiAgICAiZGlhbF9jb2RlIjogIis2ODMiLA0KICAgICJjb2RlIjogIk5VIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTm9yZm9sayBJc2xhbmQiLA0KICAgICJkaWFsX2NvZGUiOiAiKzY3MiIsDQogICAgImNvZGUiOiAiTkYiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJOb3J0aGVybiBNYXJpYW5hIElzbGFuZHMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIk1QIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiTm9yd2F5IiwNCiAgICAiZGlhbF9jb2RlIjogIis0NyIsDQogICAgImNvZGUiOiAiTk8iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJPbWFuIiwNCiAgICAiZGlhbF9jb2RlIjogIis5NjgiLA0KICAgICJjb2RlIjogIk9NIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiUGFraXN0YW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzkyIiwNCiAgICAiY29kZSI6ICJQSyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlBhbGF1IiwNCiAgICAiZGlhbF9jb2RlIjogIis2ODAiLA0KICAgICJjb2RlIjogIlBXIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiUGFsZXN0aW5pYW4gVGVycml0b3J5LCBPY2N1cGllZCIsDQogICAgImRpYWxfY29kZSI6ICIrOTcwIiwNCiAgICAiY29kZSI6ICJQUyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlBhbmFtYSIsDQogICAgImRpYWxfY29kZSI6ICIrNTA3IiwNCiAgICAiY29kZSI6ICJQQSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlBhcHVhIE5ldyBHdWluZWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzY3NSIsDQogICAgImNvZGUiOiAiUEciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJQYXJhZ3VheSIsDQogICAgImRpYWxfY29kZSI6ICIrNTk1IiwNCiAgICAiY29kZSI6ICJQWSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlBlcnUiLA0KICAgICJkaWFsX2NvZGUiOiAiKzUxIiwNCiAgICAiY29kZSI6ICJQRSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlBoaWxpcHBpbmVzIiwNCiAgICAiZGlhbF9jb2RlIjogIis2MyIsDQogICAgImNvZGUiOiAiUEgiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJQaXRjYWlybiIsDQogICAgImRpYWxfY29kZSI6ICIrODcyIiwNCiAgICAiY29kZSI6ICJQTiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlBvbGFuZCIsDQogICAgImRpYWxfY29kZSI6ICIrNDgiLA0KICAgICJjb2RlIjogIlBMIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiUG9ydHVnYWwiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM1MSIsDQogICAgImNvZGUiOiAiUFQiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJQdWVydG8gUmljbyIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiUFIiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJRYXRhciIsDQogICAgImRpYWxfY29kZSI6ICIrOTc0IiwNCiAgICAiY29kZSI6ICJRQSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlJvbWFuaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzQwIiwNCiAgICAiY29kZSI6ICJSTyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlJ1c3NpYSIsDQogICAgImRpYWxfY29kZSI6ICIrNyIsDQogICAgImNvZGUiOiAiUlUiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJSd2FuZGEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI1MCIsDQogICAgImNvZGUiOiAiUlciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJSw6l1bmlvbiIsDQogICAgImRpYWxfY29kZSI6ICIrMjYyIiwNCiAgICAiY29kZSI6ICJSRSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNhaW50IEJhcnRow6lsZW15IiwNCiAgICAiZGlhbF9jb2RlIjogIis1OTAiLA0KICAgICJjb2RlIjogIkJMIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU2FpbnQgSGVsZW5hLCBBc2NlbnNpb24gYW5kIFRyaXN0YW4gRGEgQ3VuaGEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI5MCIsDQogICAgImNvZGUiOiAiU0giDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJTYWludCBLaXR0cyBhbmQgTmV2aXMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIktOIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU2FpbnQgTHVjaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzEiLA0KICAgICJjb2RlIjogIkxDIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU2FpbnQgTWFydGluIiwNCiAgICAiZGlhbF9jb2RlIjogIis1OTAiLA0KICAgICJjb2RlIjogIk1GIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU2FpbnQgUGllcnJlIGFuZCBNaXF1ZWxvbiIsDQogICAgImRpYWxfY29kZSI6ICIrNTA4IiwNCiAgICAiY29kZSI6ICJQTSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNhaW50IFZpbmNlbnQgYW5kIHRoZSBHcmVuYWRpbmVzIiwNCiAgICAiZGlhbF9jb2RlIjogIisxIiwNCiAgICAiY29kZSI6ICJWQyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNhbW9hIiwNCiAgICAiZGlhbF9jb2RlIjogIis2ODUiLA0KICAgICJjb2RlIjogIldTIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU2FuIE1hcmlubyIsDQogICAgImRpYWxfY29kZSI6ICIrMzc4IiwNCiAgICAiY29kZSI6ICJTTSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNhbyBUb21lIGFuZCBQcmluY2lwZSIsDQogICAgImRpYWxfY29kZSI6ICIrMjM5IiwNCiAgICAiY29kZSI6ICJTVCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNhdWRpIEFyYWJpYSIsDQogICAgImRpYWxfY29kZSI6ICIrOTY2IiwNCiAgICAiY29kZSI6ICJTQSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNlbmVnYWwiLA0KICAgICJkaWFsX2NvZGUiOiAiKzIyMSIsDQogICAgImNvZGUiOiAiU04iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJTZXJiaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzM4MSIsDQogICAgImNvZGUiOiAiUlMiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJTZXljaGVsbGVzIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNDgiLA0KICAgICJjb2RlIjogIlNDIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU2llcnJhIExlb25lIiwNCiAgICAiZGlhbF9jb2RlIjogIisyMzIiLA0KICAgICJjb2RlIjogIlNMIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU2luZ2Fwb3JlIiwNCiAgICAiZGlhbF9jb2RlIjogIis2NSIsDQogICAgImNvZGUiOiAiU0ciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJTbG92YWtpYSIsDQogICAgImRpYWxfY29kZSI6ICIrNDIxIiwNCiAgICAiY29kZSI6ICJTSyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNsb3ZlbmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIiszODYiLA0KICAgICJjb2RlIjogIlNJIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU29sb21vbiBJc2xhbmRzIiwNCiAgICAiZGlhbF9jb2RlIjogIis2NzciLA0KICAgICJjb2RlIjogIlNCIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU29tYWxpYSIsDQogICAgImRpYWxfY29kZSI6ICIrMjUyIiwNCiAgICAiY29kZSI6ICJTTyINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlNvdXRoIEFmcmljYSIsDQogICAgImRpYWxfY29kZSI6ICIrMjciLA0KICAgICJjb2RlIjogIlpBIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU291dGggR2VvcmdpYSBhbmQgdGhlIFNvdXRoIFNhbmR3aWNoIElzbGFuZHMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzUwMCIsDQogICAgImNvZGUiOiAiR1MiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJTcGFpbiIsDQogICAgImRpYWxfY29kZSI6ICIrMzQiLA0KICAgICJjb2RlIjogIkVTIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU3JpIExhbmthIiwNCiAgICAiZGlhbF9jb2RlIjogIis5NCIsDQogICAgImNvZGUiOiAiTEsiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJTdWRhbiIsDQogICAgImRpYWxfY29kZSI6ICIrMjQ5IiwNCiAgICAiY29kZSI6ICJTRCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlN1cmluYW1lIiwNCiAgICAiZGlhbF9jb2RlIjogIis1OTciLA0KICAgICJjb2RlIjogIlNSIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU3ZhbGJhcmQgYW5kIEphbiBNYXllbiIsDQogICAgImRpYWxfY29kZSI6ICIrNDciLA0KICAgICJjb2RlIjogIlNKIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU3dhemlsYW5kIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNjgiLA0KICAgICJjb2RlIjogIlNaIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU3dlZGVuIiwNCiAgICAiZGlhbF9jb2RlIjogIis0NiIsDQogICAgImNvZGUiOiAiU0UiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJTd2l0emVybGFuZCIsDQogICAgImRpYWxfY29kZSI6ICIrNDEiLA0KICAgICJjb2RlIjogIkNIIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiU3lyaWFuIEFyYWIgUmVwdWJsaWMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzk2MyIsDQogICAgImNvZGUiOiAiU1kiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJUYWl3YW4iLA0KICAgICJkaWFsX2NvZGUiOiAiKzg4NiIsDQogICAgImNvZGUiOiAiVFciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJUYWppa2lzdGFuIiwNCiAgICAiZGlhbF9jb2RlIjogIis5OTIiLA0KICAgICJjb2RlIjogIlRKIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiVGFuemFuaWEsIFVuaXRlZCBSZXB1YmxpYyBvZiIsDQogICAgImRpYWxfY29kZSI6ICIrMjU1IiwNCiAgICAiY29kZSI6ICJUWiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlRoYWlsYW5kIiwNCiAgICAiZGlhbF9jb2RlIjogIis2NiIsDQogICAgImNvZGUiOiAiVEgiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJUaW1vci1MZXN0ZSIsDQogICAgImRpYWxfY29kZSI6ICIrNjcwIiwNCiAgICAiY29kZSI6ICJUTCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlRvZ28iLA0KICAgICJkaWFsX2NvZGUiOiAiKzIyOCIsDQogICAgImNvZGUiOiAiVEciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJUb2tlbGF1IiwNCiAgICAiZGlhbF9jb2RlIjogIis2OTAiLA0KICAgICJjb2RlIjogIlRLIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiVG9uZ2EiLA0KICAgICJkaWFsX2NvZGUiOiAiKzY3NiIsDQogICAgImNvZGUiOiAiVE8iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJUcmluaWRhZCBhbmQgVG9iYWdvIiwNCiAgICAiZGlhbF9jb2RlIjogIisxIiwNCiAgICAiY29kZSI6ICJUVCINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlR1bmlzaWEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzIxNiIsDQogICAgImNvZGUiOiAiVE4iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJUdXJrZXkiLA0KICAgICJkaWFsX2NvZGUiOiAiKzkwIiwNCiAgICAiY29kZSI6ICJUUiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlR1cmttZW5pc3RhbiIsDQogICAgImRpYWxfY29kZSI6ICIrOTkzIiwNCiAgICAiY29kZSI6ICJUTSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlR1cmtzIGFuZCBDYWljb3MgSXNsYW5kcyIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiVEMiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJUdXZhbHUiLA0KICAgICJkaWFsX2NvZGUiOiAiKzY4OCIsDQogICAgImNvZGUiOiAiVFYiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJVZ2FuZGEiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI1NiIsDQogICAgImNvZGUiOiAiVUciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJVa3JhaW5lIiwNCiAgICAiZGlhbF9jb2RlIjogIiszODAiLA0KICAgICJjb2RlIjogIlVBIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiVW5pdGVkIEFyYWIgRW1pcmF0ZXMiLA0KICAgICJkaWFsX2NvZGUiOiAiKzk3MSIsDQogICAgImNvZGUiOiAiQUUiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJVbml0ZWQgS2luZ2RvbSIsDQogICAgImRpYWxfY29kZSI6ICIrNDQiLA0KICAgICJjb2RlIjogIkdCIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiVW5pdGVkIFN0YXRlcyIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiVVMiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJVcnVndWF5IiwNCiAgICAiZGlhbF9jb2RlIjogIis1OTgiLA0KICAgICJjb2RlIjogIlVZIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiVXpiZWtpc3RhbiIsDQogICAgImRpYWxfY29kZSI6ICIrOTk4IiwNCiAgICAiY29kZSI6ICJVWiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlZhbnVhdHUiLA0KICAgICJkaWFsX2NvZGUiOiAiKzY3OCIsDQogICAgImNvZGUiOiAiVlUiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJWZW5lenVlbGEsIEJvbGl2YXJpYW4gUmVwdWJsaWMgb2YiLA0KICAgICJkaWFsX2NvZGUiOiAiKzU4IiwNCiAgICAiY29kZSI6ICJWRSINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlZpZXQgTmFtIiwNCiAgICAiZGlhbF9jb2RlIjogIis4NCIsDQogICAgImNvZGUiOiAiVk4iDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJWaXJnaW4gSXNsYW5kcywgQnJpdGlzaCIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiVkciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJWaXJnaW4gSXNsYW5kcywgVS5TLiIsDQogICAgImRpYWxfY29kZSI6ICIrMSIsDQogICAgImNvZGUiOiAiVkkiDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICJXYWxsaXMgYW5kIEZ1dHVuYSIsDQogICAgImRpYWxfY29kZSI6ICIrNjgxIiwNCiAgICAiY29kZSI6ICJXRiINCiAgfSwNCiAgew0KICAgICJuYW1lIjogIlllbWVuIiwNCiAgICAiZGlhbF9jb2RlIjogIis5NjciLA0KICAgICJjb2RlIjogIllFIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiWmFtYmlhIiwNCiAgICAiZGlhbF9jb2RlIjogIisyNjAiLA0KICAgICJjb2RlIjogIlpNIg0KICB9LA0KICB7DQogICAgIm5hbWUiOiAiWmltYmFid2UiLA0KICAgICJkaWFsX2NvZGUiOiAiKzI2MyIsDQogICAgImNvZGUiOiAiWlciDQogIH0sDQogIHsNCiAgICAibmFtZSI6ICLDhWxhbmQgSXNsYW5kcyIsDQogICAgImRpYWxfY29kZSI6ICIrMzU4IiwNCiAgICAiY29kZSI6ICJBWCINCiAgfQ0KXQ", 0), "UTF-8");
    }

    public static akf a(String dialogTitle) {
        akf picker = new akf();
        Bundle bundle = new Bundle();
        bundle.putString("dialogTitle", dialogTitle);
        picker.setArguments(bundle);
        return picker;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(akd$d.country_picker, null);
        Bundle args = getArguments();
        if (args != null) {
            getDialog().setTitle(args.getString("dialogTitle"));
            getDialog().getWindow().setLayout(getResources().getDimensionPixelSize(akd$a.cp_dialog_width), getResources().getDimensionPixelSize(akd$a.cp_dialog_height));
        }
        a();
        this.a = (EditText) view.findViewById(akd$c.country_code_picker_search);
        this.b = (ListView) view.findViewById(akd$c.country_code_picker_listview);
        this.c = new ake(getActivity(), this.e);
        this.b.setAdapter(this.c);
        this.b.setOnItemClickListener(new akf$1(this));
        this.a.addTextChangedListener(new akf$2(this));
        return view;
    }

    @SuppressLint({"DefaultLocale"})
    private void b(String text) {
        this.e.clear();
        for (akh country : this.d) {
            if (country.c().toLowerCase(Locale.ENGLISH).contains(text.toLowerCase())) {
                this.e.add(country);
            }
        }
        this.c.notifyDataSetChanged();
    }

    public int a(akh lhs, akh rhs) {
        return lhs.c().compareTo(rhs.c());
    }

    public akh a(Context context) {
        this.g = context;
        a();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() != 1) {
            String countryIsoCode = telephonyManager.getSimCountryIso();
            for (int i = 0; i < this.d.size(); i++) {
                akh country = (akh) this.d.get(i);
                if (country.b().equalsIgnoreCase(countryIsoCode)) {
                    country.a(c(country.b()));
                    return country;
                }
            }
        }
        return c();
    }

    private akh c() {
        akh country = new akh();
        country.b("AF");
        country.c("Afghanistan");
        country.a("93");
        country.a(akd$b.flag_af);
        return country;
    }

    private int c(String drawable) {
        try {
            return this.g.getResources().getIdentifier("flag_" + drawable.toLowerCase(Locale.ENGLISH), "drawable", this.g.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
