package nfc.share.nfcshare.model;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CurrencyLookup {
    private static final Map<Integer, CurrencyInfo> CURRENCY_MAP = new HashMap();

    public static class CurrencyInfo {
        private final String country;
        private final String currencyCode;
        private final String flag;

        public CurrencyInfo(String str, String str2, String str3) {
            this.currencyCode = str;
            this.flag = str2;
            this.country = str3;
        }

        public String getCountry() {
            return this.country;
        }

        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public String getFlag() {
            return this.flag;
        }

        public String toString() {
            return this.flag + " " + this.currencyCode + " - " + this.country;
        }
    }

    static {
        addCurrency(342, "CNY", "🇨🇳", "China");
        addCurrency(854, "INR", "🇮🇳", "Indian ruble");
        addCurrency(54, "AUD", "🇦🇺", "Australian Dollar");
        addCurrency(1798, "SOS", "🇸🇴", "Somalia");
        addCurrency(1364, "NZD", "🇳🇿", "New Zealand");
        addCurrency(515, "CZK", "🇨🇿", "Czech Republic");
        addCurrency(800, "GTQ", "🇬🇹", "Guatemala");
        addCurrency(81, "AMD", "🇦🇲", "Armenia");
        addCurrency(324, "LKR", "🇱🇰", "Sri Lanka");
        addCurrency(2182, "YER", "🇾🇪", "Yemen");
        addCurrency(2422, "CDF", "🇨🇩", "DR Congo");
        addCurrency(1048, "LAK", "🇱🇦", "Laos");
        addCurrency(2421, "BGN", "🇧🇬", "Bulgaria");
        addCurrency(278, "KHR", "🇰🇭", "Cambodia");
        addCurrency(1024, "JOD", "🇯🇴", "Jordan");
        addCurrency(2385, "XCD", "🇦🇬", "East Caribbean");
        addCurrency(658, "GIP", "🇬🇮", "Gibraltar");
        addCurrency(568, "FKP", "🇫🇰", "Falkland Islands");
        addCurrency(1808, "ZAR", "🇿🇦", "South Africa");
        addCurrency(1352, "VUV", "🇻🇺", "Vanuatu");
        addCurrency(50, "ARS", "🇦🇷", "Argentina");
        addCurrency(2136, "UYU", "🇺🇾", "Uruguay");
        addCurrency(578, "FJD", "🇫🇯", "Fiji");
        addCurrency(868, "IRR", "🇮🇷", "Iran");
        addCurrency(532, "DOP", "🇩🇴", "Dominican Republic");
        addCurrency(1892, "THB", "🇹🇭", "Thailand");
        addCurrency(1888, "SYP", "🇸🇾", "Syria");
        addCurrency(72, "BHD", "🇧🇭", "Bahrain");
        addCurrency(2436, "BOV", "🇧🇴", "Bolivia (Mvdol)");
        addCurrency(1414, "PKR", "🇵🇰", "Pakistan");
        addCurrency(18, "DZD", "🇩🇿", "Algeria");
        addCurrency(1032, "KPW", "🇰🇵", "North Korea");
        addCurrency(402, "CUP", "🇨🇺", "Cuba");
        addCurrency(2387, "XPF", "🇵🇫", "CFP Franc");
        addCurrency(2055, "MKD", "🇲🇰", "North Macedonia");
        addCurrency(1832, "SSP", "🇸🇸", "South Sudan");
        addCurrency(1864, "SZL", "🇸🇿", "Eswatini");
        addCurrency(82, "BBD", "🇧🇧", "Barbados");
        addCurrency(292, "CAD", "🇨🇦", "Canada");
        addCurrency(1176, "MDL", "🇲🇩", "Moldova");
        addCurrency(2359, "VED", "🇻🇪", "Venezuela");
        addCurrency(260, "GEL", "🇬🇪", "Georgia");
        addCurrency(100, "ETB", "🇪🇹", "Ethiopia");
        addCurrency(624, "GMD", "🇬🇲", "Gambia");
        addCurrency(1382, "NGN", "🇳🇬", "Nigeria");
        addCurrency(2437, "GHS", "🇬🇭", "Ghana");
        addCurrency(1924, "AED", "🇦🇪", "United Arab Emirates");
        addCurrency(368, "COP", "🇨🇴", "Colombia");
        addCurrency(2419, "AOA", "🇦🇴", "Angola");
        addCurrency(264, "BIF", "🇧🇮", "Burundi");
        addCurrency(2086, "GBP", "🇬🇧", "United Kingdom");
        addCurrency(1656, "STN", "🇸🇹", "São Tomé and Príncipe");
        addCurrency(2358, "GHS", "🇬🇭", "Ghana");
        addCurrency(392, "CRC", "🇨🇷", "Costa Rica");
        addCurrency(1284, "MAD", "🇲🇦", "Morocco");
        addCurrency(872, "IQD", "🇮🇶", "Iraq");
        addCurrency(2438, "BRL", "🇧🇷", "Brazil");
        addCurrency(2354, "ZWL", "🇿🇼", "Zimbabwe");
        addCurrency(1666, "SAR", "🇸🇦", "Saudi Arabia");
        addCurrency(864, "JOD", "🇯🇴", "Jordan");
        addCurrency(1588, "QAR", "🇶🇦", "Qatar");
        addCurrency(2448, "CLF", "🇨🇱", "Chile (UF)");
        addCurrency(1684, "SLL", "🇸🇱", "Sierra Leone");
        addCurrency(1878, "CHF", "🇨🇭", "Switzerland");
        addCurrency(2100, "TZS", "🇹🇿", "Tanzania");
        addCurrency(1368, "NIO", "🇳🇮", "Nicaragua");
        addCurrency(1112, "MYR", "🇲🇾", "Malaysia");
        addCurrency(1928, "TND", "🇹🇳", "Tunisia");
        addCurrency(836, "HKD", "🇭🇰", "Hong Kong");
        addCurrency(2368, "UYI", "🇺🇾", "Uruguay (UI)");
        addCurrency(1144, "MOP", "🇲🇴", "Macau");
        addCurrency(1432, "PGK", "🇵🇬", "Papua New Guinea");
        addCurrency(1620, "SHP", "🇸🇭", "Saint Helena");
        addCurrency(132, "BZD", "🇧🇿", "Belize");
        addCurrency(2375, "EUR", "🇪🇺", "Eurozone");
        addCurrency(1316, "NPR", "🇳🇵", "Nepal");
        addCurrency(338, "CLP", "🇨🇱", "Chile");
        addCurrency(2384, "FRF", "🇫🇷", "French Franc (obsolete)");
        addCurrency(1047, "KGS", "🇰🇬", "Kyrgyzstan");
        addCurrency(2371, "MZN", "🇲🇿", "Mozambique");
        addCurrency(2409, "MGA", "🇲🇬", "Madagascar");
        addCurrency(1544, "PHP", "🇵🇭", "Philippines");
        addCurrency(2432, "UAH", "🇺🇦", "Ukraine");
        addCurrency(914, "JPY", "🇯🇵", "Japan");
        addCurrency(1920, "TTD", "🇹🇹", "Trinidad and Tobago");
        addCurrency(1094, "MOP", "🇲🇴", "Macau");
        addCurrency(1028, "KES", "🇰🇪", "Kenya");
        addCurrency(2377, "TRY", "🇹🇷", "Turkey");
        addCurrency(401, "HRK", "🇭🇷", "Croatia");
        addCurrency(8, "ALL", "🇦🇱", "Albania");
        addCurrency(2353, "CUC", "🇨🇺", "Cuba (Convertible)");
        addCurrency(1540, "PEN", "🇵🇪", "Peru");
        addCurrency(1298, "OMR", "🇴🇲", "Oman");
        addCurrency(1152, "MUR", "🇲🇺", "Mauritius");
        addCurrency(1302, "NAD", "🇳🇦", "Namibia");
        addCurrency(2178, "WST", "🇼🇸", "Samoa");
        addCurrency(520, "DKK", "🇩🇰", "Denmark");
        addCurrency(2372, "AZN", "🇦🇿", "Azerbaijan");
        addCurrency(2386, "XOF", "🇨🇫", "West African CFA");
        addCurrency(2374, "RON", "🇷🇴", "Romania");
        addCurrency(2144, "UZS", "🇺🇿", "Uzbekistan");
        addCurrency(1076, "LYD", "🇱🇾", "Libya");
        addCurrency(68, "BSD", "🇧🇸", "Bahamas");
        addCurrency(1400, "NOK", "🇳🇴", "Norway");
        addCurrency(610, "DJF", "🇩🇯", "Djibouti");
        addCurrency(1108, "MWK", "🇲🇼", "Malawi");
        addCurrency(1330, "ANG", "🇨🇼", "Curaçao");
        addCurrency(2433, "GEL", "🇬🇪", "Georgia");
        addCurrency(808, "GYD", "🇬🇾", "Guyana");
        addCurrency(144, "SBD", "🇸🇧", "Solomon Islands");
        addCurrency(818, "HTG", "🇭🇹", "Haiti");
        addCurrency(1874, "SEK", "🇸🇪", "Sweden");
        addCurrency(2072, "EGP", "🇪🇬", "Egypt");
        addCurrency(306, "CVE", "🇨🇻", "Cape Verde");
        addCurrency(2408, "SRD", "🇸🇷", "Suriname");
        addCurrency(1044, "KWD", "🇰🇼", "Kuwait");
        addCurrency(560, "ETB", "🇪🇹", "Ethiopia");
        addCurrency(80, "BDT", "🇧🇩", "Bangladesh");
        addCurrency(1156, "MXN", "🇲🇽", "Mexico");
        addCurrency(1680, "SCR", "🇸🇨", "Seychelles");
        addCurrency(832, "HNL", "🇭🇳", "Honduras");
        addCurrency(2420, "BYN", "🇧🇾", "Belarus");
        addCurrency(1603, "RUB", "🇷🇺", "Russia");
        addCurrency(2417, "AFN", "🇦🇫", "Afghanistan");
        addCurrency(1424, "PAB", "🇵🇦", "Panama");
        addCurrency(1910, "TOP", "🇹🇴", "Tonga");
        addCurrency(2112, "USD", "🇺🇸", "United States");
        addCurrency(2376, "CHW", "🇨🇭", "WIR Franc");
        addCurrency(850, "ISK", "🇮🇸", "Iceland");
        addCurrency(96, "BMD", "🇧🇲", "Bermuda");
        addCurrency(150, "BND", "🇧🇳", "Brunei");
        addCurrency(2356, "TMT", "🇹🇲", "Turkmenistan");
        addCurrency(840, "HUF", "🇭🇺", "Hungary");
        addCurrency(1072, "LRD", "🇱🇷", "Liberia");
        addCurrency(310, "KYD", "🇰🇾", "Cayman Islands");
        addCurrency(886, "ILS", "🇮🇱", "Israel");
        addCurrency(2407, "ZMW", "🇿🇲", "Zambia");
        addCurrency(2424, "EUR", "🇪🇺", "Eurozone");
        addCurrency(546, "SVC", "🇸🇻", "El Salvador");
        addCurrency(2048, "UGX", "🇺🇬", "Uganda");
        addCurrency(904, "JMD", "🇯🇲", "Jamaica");
        addCurrency(372, "KMF", "🇰🇲", "Comoros");
        addCurrency(1796, "VND", "🇻🇳", "Vietnam");
        addCurrency(2369, "RSD", "🇷🇸", "Serbia");
        addCurrency(114, "BWP", "🇧🇼", "Botswana");
        addCurrency(2423, "BAM", "🇧🇦", "Bosnia and Herzegovina");
        addCurrency(1794, "SGD", "🇸🇬", "Singapore");
        addCurrency(920, "KZT", "🇰🇿", "Kazakhstan");
        addCurrency(2305, "TWD", "🇹🇼", "Taiwan");
        addCurrency(2418, "TJS", "🇹🇯", "Tajikistan");
        addCurrency(1331, "AWG", "🇦🇼", "Aruba");
        addCurrency(2360, "SDG", "🇸🇩", "Sudan");
        addCurrency(804, "GNF", "🇬🇳", "Guinea");
        addCurrency(104, "BOB", "🇧🇴", "Bolivia");
        addCurrency(1058, "LBP", "🇱🇧", "Lebanon");
        addCurrency(1536, "PYG", "🇵🇾", "Paraguay");
        addCurrency(1174, "MNT", "🇲🇳", "Mongolia");
        addCurrency(1122, "MVR", "🇲🇻", "Maldives");
        addCurrency(2425, "MXV", "🇲🇽", "Mexican UDI");
        addCurrency(1606, "RWF", "🇷🇼", "Rwanda");
        addCurrency(562, "ERN", "🇪🇷", "Eritrea");
    }

    private static void addCurrency(int i2, String str, String str2, String str3) {
        CURRENCY_MAP.put(Integer.valueOf(i2), new CurrencyInfo(str, str2, str3));
    }

    public static CurrencyInfo lookup(int i2) {
        return CURRENCY_MAP.get(Integer.valueOf(i2));
    }

    public static void main(String[] strArr) {
        CurrencyInfo lookup = lookup(2112);
        System.out.println("美元信息: " + lookup);
        CurrencyInfo lookup2 = lookup(2424);
        System.out.println("欧元信息: " + lookup2);
        Object lookup3 = lookup(9999);
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("未知货币: ");
        if (lookup3 == null) {
            lookup3 = "未找到";
        }
        sb.append(lookup3);
        printStream.println(sb.toString());
    }
}
