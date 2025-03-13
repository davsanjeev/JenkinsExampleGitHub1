package Dev_Sanj;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.time.Instant;
import java.util.Date;
// --- <<IS-END-IMPORTS>> ---

public final class Utils

{
	// ---( internal utility methods )---

	final static Utils _instance = new Utils();

	static Utils _newInstance() { return new Utils(); }

	static Utils _cast(Object o) { return (Utils)o; }

	// ---( server methods )---




	public static final void convertDateTimetoUnixTimeStamp (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertDateTimetoUnixTimeStamp)>> ---
		// @sigtype java 3.5
		// [i] field:0:required CurrentDataTime
		// [o] field:0:required UnixTimeStamp
		// pipeline
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	CurrentDataTime = IDataUtil.getString( pipelineCursor, "CurrentDataTime" );
		pipelineCursor.destroy();
		
		Date now = new Date(CurrentDataTime);
		long ut3 = now.getTime() / 1000L;
		String ut4 = String.valueOf(ut3);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "UnixTimeStamp", ut4 );
		pipelineCursor_1.destroy();
		
				
		// --- <<IS-END>> ---

                
	}



	public static final void replaceNonASCIICharacters (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replaceNonASCIICharacters)>> ---
		// @sigtype java 3.5
		// [i] field:0:required strValue
		// [i] field:0:required ReplaceValue
		// [o] field:0:required strValueOut
		// pipeline
				IDataCursor pipelineCursor = pipeline.getCursor();
					String	strValue = IDataUtil.getString( pipelineCursor, "strValue" );
					String	ReplaceValue = IDataUtil.getString( pipelineCursor, "ReplaceValue" );
				pipelineCursor.destroy();
				String strValueOut = strValue.replaceAll( "[^\\x00-\\x7F]", ReplaceValue);
				// pipeline
				IDataCursor pipelineCursor_1 = pipeline.getCursor();
				IDataUtil.put( pipelineCursor_1, "strValueOut", strValueOut );
				pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

