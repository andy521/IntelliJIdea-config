#set($str = "")
#set($stringClass = $str.getClass())
#set($date = $stringClass.forName("java.util.Date").newInstance())
#set($dateFormat = $stringClass.forName("java.text.SimpleDateFormat").getConstructor($stringClass).newInstance("yyyy年MM月dd日 ah:mm:ss"))
#set($fdate = $dateFormat.format($date))
/**
 *
 * @author Jerry.Chen
 * @since $fdate
 */