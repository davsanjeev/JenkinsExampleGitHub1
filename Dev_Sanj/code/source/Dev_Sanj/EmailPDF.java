package Dev_Sanj;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class EmailPDF

{
	// ---( internal utility methods )---

	final static EmailPDF _instance = new EmailPDF();

	static EmailPDF _newInstance() { return new EmailPDF(); }

	static EmailPDF _cast(Object o) { return (EmailPDF)o; }

	// ---( server methods )---




	public static final void getFileSizeInBytes (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getFileSizeInBytes)>> ---
		// @sigtype java 3.5
		// [i] field:0:required fileName
		// [o] field:0:required fileSizeInBytes
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	fileName = IDataUtil.getString( pipelineCursor, "fileName" );
		pipelineCursor.destroy();
		
		File f = new File(fileName); 
		long fileSize = f.length();
		String s=String.valueOf(fileSize);
				// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "fileSizeInBytes", s);
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

