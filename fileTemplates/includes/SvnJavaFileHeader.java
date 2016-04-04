#set($str = "")
#set($stringClass = $str.getClass())
#set($date = $stringClass.forName("java.util.Date").newInstance())
#set($dateFormat = $stringClass.forName("java.text.SimpleDateFormat").getConstructor($stringClass).newInstance("yyyy年M月d日 ah:mm:ss"))
#set($fdate = $dateFormat.format($date))
/**
 * Created by Yao.Chen on $fdate.
 *
 * @author $Author$
 * @version $Revision$
 * @since $Date$
 */