HealthHelper
============

颈椎保健操，HealthHelper
<p>
	<span style="font-size:18px">&nbsp; &nbsp; &nbsp; &nbsp; 前段时间在知乎上回答<a target="_blank" href="http://www.zhihu.com/question/24859918">已入 IT 行业的前辈，有哪些关于保护身体健康的知识分享给 IT 新人？</a>&nbsp;，回复了一张图片，评论里面有知友希望通过程序能够实现，我后面尝试着通过程序实现了效果，现开源出来，大家可以随便改动。</span>
</p>
<p>
	<span style="font-size:18px"><img src="http://img.blog.csdn.net/20140823153330143?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZWtldXk=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" alt="" /><br />
	</span>
</p>
<p>
	<span style="font-size:18px"><br />
	</span>
</p>
<p>
	<span style="font-size:18px">&nbsp; &nbsp; &nbsp; &nbsp;要实现上面这样的效果，其实很简单，自定义view，然后调用Canvs的drawTextOnPath方法即可，但干巴巴地显示一张图片太乏味了，也不能解决有些喜欢转手机不转脖子的朋友，所以干脆将显示效果做成动态的，弧线、圆、折线一点一点地画出来，眼睛跟着线的轨迹走就可以了，下面是一些效果图：</span>
</p>
<p>
	<span style="font-size:18px"><img src="http://img.blog.csdn.net/20140823153630854?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZWtldXk=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" alt="" /><br />
	</span>
</p>
<p>
	<span style="font-size:18px"><br />
	</span>
</p>
<p>
	<span style="font-size:18px"><img src="http://img.blog.csdn.net/20140823153644613?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZWtldXk=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" alt="" /><br />
	</span>
</p>
<p>
	<span style="font-size:18px"><br />
	</span>
</p>
<p>
	<span style="font-size:18px"><img src="http://img.blog.csdn.net/20140823153655424?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZWtldXk=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" alt="" /><br />
	</span>
</p>
<p>
	<span style="font-size:18px"><br />
	</span>
</p>
<p>
	<span style="font-size:18px">&nbsp; &nbsp; &nbsp; &nbsp;其实现在做的效果也很乏味，最好是将一些笑话、小常识加到每一种风格中，切换时随机出现笑话和类型，这样才能达到锻炼和娱乐的目的。</span>
</p>
<p>
	<span style="font-size:18px"><br />
	</span>
</p>
<p style="text-align:center">
	<span style="font-size:18px">开源地址：<a target="_blank" href="https://github.com/zmywly8866/HealthHelper">HealthHelper</a></span>
</p>
