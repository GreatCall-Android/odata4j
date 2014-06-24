package org.odata4j.consumer.util;

import java.io.Closeable;

import javax.xml.stream.XMLEventReader;

import org.odata4j.consumer.ODataClientResponse;
import org.odata4j.stax2.XMLEventReader2;

public class StreamUtils {
	private static final String ERROR_MESSAGE = "ERROR ON STREAM CLOSURE, A FILE HANDLE MAY HAVE LEAKED!!!";
	
	public static void closeStream( Closeable stream ) {
		if( stream == null ) return;
		try {
			stream.close();
		} catch( Throwable t ) {
			new Throwable( ERROR_MESSAGE, t ).printStackTrace();
		}
	}
	
	public static void closeStream( ODataClientResponse stream ) {
		if( stream == null ) return;
		try {
			stream.close();
		} catch( Throwable t ) {
			new Throwable( ERROR_MESSAGE, t ).printStackTrace();
		}
	}
	
	public static void closeStream( XMLEventReader stream ) {
		if( stream == null ) return;
		try {
			stream.close();
		} catch( Throwable t ) {
			new Throwable( ERROR_MESSAGE, t ).printStackTrace();
		}
	}
	
	public static void closeStream( XMLEventReader2 stream ) {
		if( stream == null ) return;
		try {
			stream.close();
		} catch( Throwable t ) {
			new Throwable( ERROR_MESSAGE, t ).printStackTrace();
		}
	}
}
