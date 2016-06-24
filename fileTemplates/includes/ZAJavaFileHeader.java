#set($str = "")
#set($stringClass = $str.getClass())
#set($date = $stringClass.forName("java.util.Date").newInstance())
#set($dateFormat = $stringClass.forName("java.text.SimpleDateFormat").getConstructor($stringClass).newInstance("yyyy年M月d日 ah:mm:ss"))
#set($fdate = $dateFormat.format($date))
/**
 * 类${NAME}的实现描述：TODO 类实现描述
 *
 * @author chenyao $fdate
 */
