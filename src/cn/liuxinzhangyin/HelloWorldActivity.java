package cn.liuxinzhangyin;

import cn.liuxinzhangyin.openchat.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class HelloWorldActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		// ʹ��hello_world.xml�ļ�����Ľ��沼��
		setContentView(R.layout.openchat);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.openchat, menu);
		return true;
	}
	public void clickHandler(View source)
	{
		// ��ȡUI������IDΪR.id.show���ı���
		TextView tv = (TextView) findViewById(R.id.show);
		// �ı��ı�����ı�����
		tv.setText("Hello Android-" + new java.util.Date());
	}
}
