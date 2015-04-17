package com.heshaokang.util;

/**
 * Created by heshaokang on 2015/4/15.
 */
public class Constants {
    private Constants(){}
    public static final String JSON_REQUEST_URL = "http://app.api.autohome.com.cn/autov4.3/cars/seriesprice-a2-pm2-v4.3.0-b42-t1.html";
    public static final String XML_REQUEST_URL = "http://flash.weather.com.cn/wmaps/xml/china.xml";
    public static final String[] IMAGES_URL = {
            // 小图
            "http://car0.autoimg.cn/upload/2014/10/3/s_20141003015514509-110.jpg",
            "http://car0.autoimg.cn/upload/2014/10/3/s_20141003015436443-110.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522261885926411.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522262753326411.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522264830126410.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522234807726411.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522241219626411.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522223742126411.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522222242926411.jpg",
            "http://car0.autoimg.cn/upload/2014/9/25/s_2014092522212610426410.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090500294461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090453812461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090447744461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090442556461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090430177461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090253967461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090438352461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090433866461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090240472461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090248391461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090243898461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090236347461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090232734461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090228328461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090232734461211.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090228328461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090243898461210.jpg",
            "http://car0.autoimg.cn/upload/2014/9/19/s_20140919090248391461210.jpg",
            "http://car0.autoimg.cn/upload/2014/11/20/s_20141120201111485-111.jpg",
            "http://car0.autoimg.cn/upload/2014/11/20/s_20141120201112764-111.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144602063213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624145217027213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144615854213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144609054213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144556371213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144611439213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144552237213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144552237213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144611439213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624144609054213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/24/s_20140624145217027213.jpg",
            "http://car0.autoimg.cn/upload/2014/6/5/s_201406051622484833765.jpg",
            "http://car0.autoimg.cn/upload/2014/6/5/s_201406051622484373765.jpg",
            "http://car0.autoimg.cn/upload/2014/4/19/s_20140419160042793-1.jpg",
            "http://car0.autoimg.cn/upload/2014/4/19/s_20140419160020342-1.jpg",
            "http://car0.autoimg.cn/upload/2014/4/19/s_20140419160118970-1.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091112527264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091109314264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091107315264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091102775264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091104696264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091057206264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091102340264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091046379264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091050326264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091051670264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091048410264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091053602264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091044369264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091059298264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091055554264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091042448264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091039235264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091041093264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091035896264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091037926264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091032105264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/13/s_20131213091033995264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/4/s_20131204094426483264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/4/s_20131204094422796264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/4/s_20131204094423566264.jpg",
            "http://car0.autoimg.cn/upload/2013/12/4/s_20131204094420284264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091913244264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091914750264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091909313264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091910491264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091905007264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091903081264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091857722264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091859181264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091853713264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091855469264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091850125264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091851756264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091846287264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091847918264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091842044264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091843129264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091836662264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091838246264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091833043264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091834721264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091830680264.jpg",
            "http://car0.autoimg.cn/upload/2013/11/15/s_20131115091828987264.jpg",
            "http://car0.autoimg.cn/upload/2013/9/11/s_20130911023343211-1.jpg",
            "http://car0.autoimg.cn/upload/2013/9/11/s_20130911023337065-1.jpg",
            "http://car0.autoimg.cn/upload/2013/9/11/s_20130911023335895-1.jpg",
            "http://car0.autoimg.cn/upload/2013/9/11/s_20130911023334709-1.jpg",
            "http://car0.autoimg.cn/upload/2013/9/11/s_20130911023333461-1.jpg",
            "http://car0.autoimg.cn/upload/2013/9/11/s_20130911023332291-1.jpg",
            "http://car0.autoimg.cn/upload/2013/9/10/s_20130910194443167264.jpg",
            "http://car0.autoimg.cn/upload/2013/9/10/s_20130910194428238264.jpg",
            "http://car0.autoimg.cn/upload/2013/9/10/s_20130910194436428264.jpg",
            "http://car0.autoimg.cn/upload/2013/8/21/s_20130821073652422264.jpg",
            "http://car0.autoimg.cn/upload/2013/8/21/s_20130821073645230264.jpg",
            "http://car0.autoimg.cn/upload/2013/8/21/s_20130821073643615264.jpg",
            "http://car0.autoimg.cn/upload/2013/8/21/s_20130821073637469264.jpg",
            "http://car0.autoimg.cn/upload/2013/8/21/s_20130821073640082264.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191958289594407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191958147484407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191958023144407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191957495074407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191957327214407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191957029414407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191957220354407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191956111814407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191955380144407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191955499014407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191955596204407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191955237724407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191955079544407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191954574854407.jpg",
            "http://car0.autoimg.cn/upload/2013/2/19/s_201302191954449284407.jpg",
            "http://car0.autoimg.cn/upload/2012/11/23/s_20121123004218160-1.jpg",
            "http://car0.autoimg.cn/upload/2012/11/23/s_20121123004029194-1.jpg",
            "http://car0.autoimg.cn/upload/2012/11/22/s_20121122223300627-1.jpg",
            "http://car0.autoimg.cn/upload/2012/11/22/s_20121122223303014-1.jpg",
            "http://car0.autoimg.cn/upload/2012/11/22/s_20121122223317169-1.jpg",
            "http://car0.autoimg.cn/upload/2012/11/22/s_20121122223313971-1.jpg",
            "http://car0.autoimg.cn/upload/2012/9/28/s_20120928024826408-1.jpg",
            "http://car0.autoimg.cn/upload/2012/9/28/s_20120928024825066-1.jpg",
            "http://car0.autoimg.cn/upload/2012/9/28/s_20120928024557185-1.jpg",
            "http://car0.autoimg.cn/upload/2012/9/28/s_20120928024506197-1.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_2012070516253479233.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_2012070516240563833.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_2012070516235911733.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_2012070516235375133.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_2012070516241202933.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_2012070516234337733.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174633167123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174630370123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174619823123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174617292123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174614463123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174624526123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174627573123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174611588123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174604713123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174559838123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174602463123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174557260123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174554635123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174546057123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174552057123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174548448123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174543057123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174440573123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174540542123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174405526123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101115174402917123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101104175138301123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101104175135957123.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155453284264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155454628264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155451565264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155449987264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155448174264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155445596264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155443628264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155442503264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155439190264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155437956264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155436721264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155434143264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155431112264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155432393264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155429003264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155427643264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155425831264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155424721264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155420518264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155423549264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155415096264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155410987264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155406753264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155404628264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155403393264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155358643264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155402003264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155357346264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155355534264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155354112264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155351690264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155350456264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155348628264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155346206264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155344971264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155342753264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155343862264.jpg",
            "http://car0.autoimg.cn/upload/spec/5742/s_20101014155341643264.jpg",

            // 大图
            "http://img0.bdstatic.com/img/image/2043d07892fc42f2350bebb36c4b72ce1409212020.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=b5bd9f6ffa1986184147e8877aec2e69/3c6d55fbb2fb43166b84607422a4462309f7d320.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=39e24064544e9258a63481edac83d1d1/fd039245d688d43fb75539f27f1ed21b0ef43b35.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=41d564709058d109c4e3aeb1e159ccd0/9345d688d43f879438434f20d01b0ef41bd53a7b.jpg",
            "http://h.hiphotos.baidu.com/image/w%3D230/sign=a4c96b59014f78f0800b9df049310a83/4d086e061d950a7b5d2cbbc908d162d9f2d3c9a6.jpg",
            "http://b.hiphotos.baidu.com/image/w%3D230/sign=08cb7b0fb33533faf5b6942d98d3fdca/dcc451da81cb39dba7ee9557d2160924ab183080.jpg",
            "http://imgt6.bdstatic.com/it/u=2,834881123&fm=25&gp=0.jpg",
            "http://imgt7.bdstatic.com/it/u=2,828542869&fm=25&gp=0.jpg",
            "http://imgt9.bdstatic.com/it/u=1,2627826078&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=2,1042436357&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=1,1081146144&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=2,1040929835&fm=25&gp=0.jpg",
            "http://imgt7.bdstatic.com/it/u=2,1035954350&fm=25&gp=0.jpg",
            "http://img0.bdstatic.com/img/image/c6774aeee9cc323de700edcf4f2a40781409804177.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=8b320cdf56e736d158138b0bab504ffc/cdbf6c81800a19d88f02c60631fa828ba61e46ab.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=4cb85fd9d2160924dc25a518e406359b/728da9773912b31b4a14f5a68418367adbb4e1c1.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=ea9e16090ed79123e0e093779d345917/b58f8c5494eef01f1a375ec4e2fe9925bc317d8b.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=2c3d014cd5ca7bcb7d7bc02c8e086b3f/902397dda144ad3407b1bf08d2a20cf431ad8536.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=2abed15057fbb2fb342b5f117f4a2043/e850352ac65c1038201317cfb0119313b07e894a.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=1d9590ef4dc2d562f208d7eed71090f3/b03533fa828ba61e0c7ef6a04334970a314e59a8.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=a8efa9d98501a18bf0eb154cae2e0761/08f790529822720e2fc8cd0f79cb0a46f31fabc4.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=c83768cb0ef3d7ca0cf63875c21ebe3c/0dd7912397dda144fd214347b0b7d0a20cf4861e.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=9e0c0121708b4710ce2ffacff3cfc3b2/83025aafa40f4bfbdf406754014f78f0f7361819.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=db44ace783cb39dbc1c06055e01709a7/8b82b9014a90f603750d544a3b12b31bb051ed7a.jpg",
            "http://image.baidu.com/detail/newindex?col=%E6%98%8E%E6%98%9F&tag=%E5%88%98%E4%BA%A6%E8%8F%B2&pn=2&pid=9420591584&user_id=854767340&setid=-1&sort=0&from=1",
            "http://f.hiphotos.baidu.com/image/w%3D230/sign=d820be254b540923aa69647da259d1dc/c9fcc3cec3fdfc03c7d4a3bed63f8794a4c22603.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=c9cff8c508d162d985ee651f21dea950/500fd9f9d72a6059eeea571b2a34349b033bba3d.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=a141ec134d4a20a4311e3bc4a0529847/5243fbf2b211931352294bb167380cd791238d4d.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=330f151e4f086e066aa8384832097b5a/f7246b600c338744606ea653520fd9f9d72aa072.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=0ddfb60c72cf3bc7e800caefe101babd/43a7d933c895d143c79dae2271f082025baf07c3.jpg",
            "http://b.hiphotos.baidu.com/image/w%3D230/sign=b9eefbf7a5efce1bea2bcfc99f51f3e8/960a304e251f95caf8c92ab7cb177f3e670952f6.jpg",
            "http://imgt8.bdstatic.com/it/u=2,830905421&fm=25&gp=0.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=ece9d6ba1bd8bc3ec60801c9b28aa6c8/1ad5ad6eddc451da01a36f6bb4fd5266d11632dc.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=4683e62d03e9390156028a3d4bed54f9/9358d109b3de9c82eb02a7826e81800a19d84353.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=87af9dc5184c510faec4e51950582528/4a36acaf2edda3cc7c32fb2d03e93901203f92ec.jpg",
            "http://h.hiphotos.baidu.com/image/w%3D230/sign=66634bf839c79f3d8fe1e3338aa0cdbc/d833c895d143ad4b7e4d48c780025aafa40f0651.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=7a6c014057fbb2fb342b5f117f4b2043/e850352ac65c103870c1c7dfb0119313b07e896b.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=6a21ab13249759ee4a5067c882fa434e/b7003af33a87e95057f13c7212385343faf2b4ce.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=a509bbfb257f9e2f70351a0b2f31e962/730e0cf3d7ca7bcb0ec4ce32bc096b63f624a86b.jpg",
            "http://imgt9.bdstatic.com/it/u=2,946257773&fm=25&gp=0.jpg",
            "http://img0.bdstatic.com/img/image/2043d07892fc42f2350bebb36c4b72ce1409212020.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=b5bd9f6ffa1986184147e8877aec2e69/3c6d55fbb2fb43166b84607422a4462309f7d320.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=39e24064544e9258a63481edac83d1d1/fd039245d688d43fb75539f27f1ed21b0ef43b35.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=41d564709058d109c4e3aeb1e159ccd0/9345d688d43f879438434f20d01b0ef41bd53a7b.jpg",
            "http://h.hiphotos.baidu.com/image/w%3D230/sign=a4c96b59014f78f0800b9df049310a83/4d086e061d950a7b5d2cbbc908d162d9f2d3c9a6.jpg",
            "http://b.hiphotos.baidu.com/image/w%3D230/sign=08cb7b0fb33533faf5b6942d98d3fdca/dcc451da81cb39dba7ee9557d2160924ab183080.jpg",
            "http://imgt6.bdstatic.com/it/u=2,834881123&fm=25&gp=0.jpg",
            "http://imgt7.bdstatic.com/it/u=2,828542869&fm=25&gp=0.jpg",
            "http://imgt9.bdstatic.com/it/u=1,2627826078&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=2,1042436357&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=1,1081146144&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=2,1040929835&fm=25&gp=0.jpg",
            "http://imgt7.bdstatic.com/it/u=2,1035954350&fm=25&gp=0.jpg",
            "http://img0.bdstatic.com/img/image/c6774aeee9cc323de700edcf4f2a40781409804177.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=8b320cdf56e736d158138b0bab504ffc/cdbf6c81800a19d88f02c60631fa828ba61e46ab.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=4cb85fd9d2160924dc25a518e406359b/728da9773912b31b4a14f5a68418367adbb4e1c1.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=ea9e16090ed79123e0e093779d345917/b58f8c5494eef01f1a375ec4e2fe9925bc317d8b.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=2c3d014cd5ca7bcb7d7bc02c8e086b3f/902397dda144ad3407b1bf08d2a20cf431ad8536.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=2abed15057fbb2fb342b5f117f4a2043/e850352ac65c1038201317cfb0119313b07e894a.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=1d9590ef4dc2d562f208d7eed71090f3/b03533fa828ba61e0c7ef6a04334970a314e59a8.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=a8efa9d98501a18bf0eb154cae2e0761/08f790529822720e2fc8cd0f79cb0a46f31fabc4.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=c83768cb0ef3d7ca0cf63875c21ebe3c/0dd7912397dda144fd214347b0b7d0a20cf4861e.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=9e0c0121708b4710ce2ffacff3cfc3b2/83025aafa40f4bfbdf406754014f78f0f7361819.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=db44ace783cb39dbc1c06055e01709a7/8b82b9014a90f603750d544a3b12b31bb051ed7a.jpg",
            "http://image.baidu.com/detail/newindex?col=%E6%98%8E%E6%98%9F&tag=%E5%88%98%E4%BA%A6%E8%8F%B2&pn=2&pid=9420591584&user_id=854767340&setid=-1&sort=0&from=1",
            "http://f.hiphotos.baidu.com/image/w%3D230/sign=d820be254b540923aa69647da259d1dc/c9fcc3cec3fdfc03c7d4a3bed63f8794a4c22603.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=c9cff8c508d162d985ee651f21dea950/500fd9f9d72a6059eeea571b2a34349b033bba3d.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=a141ec134d4a20a4311e3bc4a0529847/5243fbf2b211931352294bb167380cd791238d4d.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=330f151e4f086e066aa8384832097b5a/f7246b600c338744606ea653520fd9f9d72aa072.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=0ddfb60c72cf3bc7e800caefe101babd/43a7d933c895d143c79dae2271f082025baf07c3.jpg",
            "http://b.hiphotos.baidu.com/image/w%3D230/sign=b9eefbf7a5efce1bea2bcfc99f51f3e8/960a304e251f95caf8c92ab7cb177f3e670952f6.jpg",
            "http://imgt8.bdstatic.com/it/u=2,830905421&fm=25&gp=0.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=ece9d6ba1bd8bc3ec60801c9b28aa6c8/1ad5ad6eddc451da01a36f6bb4fd5266d11632dc.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=4683e62d03e9390156028a3d4bed54f9/9358d109b3de9c82eb02a7826e81800a19d84353.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=87af9dc5184c510faec4e51950582528/4a36acaf2edda3cc7c32fb2d03e93901203f92ec.jpg",
            "http://h.hiphotos.baidu.com/image/w%3D230/sign=66634bf839c79f3d8fe1e3338aa0cdbc/d833c895d143ad4b7e4d48c780025aafa40f0651.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=7a6c014057fbb2fb342b5f117f4b2043/e850352ac65c103870c1c7dfb0119313b07e896b.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=6a21ab13249759ee4a5067c882fa434e/b7003af33a87e95057f13c7212385343faf2b4ce.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=a509bbfb257f9e2f70351a0b2f31e962/730e0cf3d7ca7bcb0ec4ce32bc096b63f624a86b.jpg",
            "http://imgt9.bdstatic.com/it/u=2,946257773&fm=25&gp=0.jpg",
            "http://img0.bdstatic.com/img/image/2043d07892fc42f2350bebb36c4b72ce1409212020.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=b5bd9f6ffa1986184147e8877aec2e69/3c6d55fbb2fb43166b84607422a4462309f7d320.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=39e24064544e9258a63481edac83d1d1/fd039245d688d43fb75539f27f1ed21b0ef43b35.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=41d564709058d109c4e3aeb1e159ccd0/9345d688d43f879438434f20d01b0ef41bd53a7b.jpg",
            "http://h.hiphotos.baidu.com/image/w%3D230/sign=a4c96b59014f78f0800b9df049310a83/4d086e061d950a7b5d2cbbc908d162d9f2d3c9a6.jpg",
            "http://b.hiphotos.baidu.com/image/w%3D230/sign=08cb7b0fb33533faf5b6942d98d3fdca/dcc451da81cb39dba7ee9557d2160924ab183080.jpg",
            "http://imgt6.bdstatic.com/it/u=2,834881123&fm=25&gp=0.jpg",
            "http://imgt7.bdstatic.com/it/u=2,828542869&fm=25&gp=0.jpg",
            "http://imgt9.bdstatic.com/it/u=1,2627826078&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=2,1042436357&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=1,1081146144&fm=25&gp=0.jpg",
            "http://imgt8.bdstatic.com/it/u=2,1040929835&fm=25&gp=0.jpg",
            "http://imgt7.bdstatic.com/it/u=2,1035954350&fm=25&gp=0.jpg",
            "http://img0.bdstatic.com/img/image/c6774aeee9cc323de700edcf4f2a40781409804177.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=8b320cdf56e736d158138b0bab504ffc/cdbf6c81800a19d88f02c60631fa828ba61e46ab.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=4cb85fd9d2160924dc25a518e406359b/728da9773912b31b4a14f5a68418367adbb4e1c1.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=ea9e16090ed79123e0e093779d345917/b58f8c5494eef01f1a375ec4e2fe9925bc317d8b.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=2c3d014cd5ca7bcb7d7bc02c8e086b3f/902397dda144ad3407b1bf08d2a20cf431ad8536.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=2abed15057fbb2fb342b5f117f4a2043/e850352ac65c1038201317cfb0119313b07e894a.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=1d9590ef4dc2d562f208d7eed71090f3/b03533fa828ba61e0c7ef6a04334970a314e59a8.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=a8efa9d98501a18bf0eb154cae2e0761/08f790529822720e2fc8cd0f79cb0a46f31fabc4.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=c83768cb0ef3d7ca0cf63875c21ebe3c/0dd7912397dda144fd214347b0b7d0a20cf4861e.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=9e0c0121708b4710ce2ffacff3cfc3b2/83025aafa40f4bfbdf406754014f78f0f7361819.jpg",
            "http://g.hiphotos.baidu.com/image/w%3D230/sign=db44ace783cb39dbc1c06055e01709a7/8b82b9014a90f603750d544a3b12b31bb051ed7a.jpg",
            "http://image.baidu.com/detail/newindex?col=%E6%98%8E%E6%98%9F&tag=%E5%88%98%E4%BA%A6%E8%8F%B2&pn=2&pid=9420591584&user_id=854767340&setid=-1&sort=0&from=1",
            "http://f.hiphotos.baidu.com/image/w%3D230/sign=d820be254b540923aa69647da259d1dc/c9fcc3cec3fdfc03c7d4a3bed63f8794a4c22603.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=c9cff8c508d162d985ee651f21dea950/500fd9f9d72a6059eeea571b2a34349b033bba3d.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=a141ec134d4a20a4311e3bc4a0529847/5243fbf2b211931352294bb167380cd791238d4d.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=330f151e4f086e066aa8384832097b5a/f7246b600c338744606ea653520fd9f9d72aa072.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=0ddfb60c72cf3bc7e800caefe101babd/43a7d933c895d143c79dae2271f082025baf07c3.jpg",
            "http://b.hiphotos.baidu.com/image/w%3D230/sign=b9eefbf7a5efce1bea2bcfc99f51f3e8/960a304e251f95caf8c92ab7cb177f3e670952f6.jpg",
            "http://imgt8.bdstatic.com/it/u=2,830905421&fm=25&gp=0.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=ece9d6ba1bd8bc3ec60801c9b28aa6c8/1ad5ad6eddc451da01a36f6bb4fd5266d11632dc.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=4683e62d03e9390156028a3d4bed54f9/9358d109b3de9c82eb02a7826e81800a19d84353.jpg",
            "http://a.hiphotos.baidu.com/image/w%3D230/sign=87af9dc5184c510faec4e51950582528/4a36acaf2edda3cc7c32fb2d03e93901203f92ec.jpg",
            "http://h.hiphotos.baidu.com/image/w%3D230/sign=66634bf839c79f3d8fe1e3338aa0cdbc/d833c895d143ad4b7e4d48c780025aafa40f0651.jpg",
            "http://d.hiphotos.baidu.com/image/w%3D230/sign=7a6c014057fbb2fb342b5f117f4b2043/e850352ac65c103870c1c7dfb0119313b07e896b.jpg",
            "http://c.hiphotos.baidu.com/image/w%3D230/sign=6a21ab13249759ee4a5067c882fa434e/b7003af33a87e95057f13c7212385343faf2b4ce.jpg",
            "http://e.hiphotos.baidu.com/image/w%3D230/sign=a509bbfb257f9e2f70351a0b2f31e962/730e0cf3d7ca7bcb0ec4ce32bc096b63f624a86b.jpg",
            "http://imgt9.bdstatic.com/it/u=2,946257773&fm=25&gp=0.jpg",

    };
    public static class Extra {
        public static final String FRAGMENT_INDEX="com.heshaokang.volleyDemo";
    }
}
