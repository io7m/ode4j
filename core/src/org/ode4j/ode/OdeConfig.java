/*************************************************************************
 *                                                                       *
 * Open Dynamics Engine, Copyright (C) 2001,2002 Russell L. Smith.       *
 * All rights reserved.  Email: russ@q12.org   Web: www.q12.org          *
 * Open Dynamics Engine 4J, Copyright (C) 2007-2010 Tilmann Zäschke      *
 * All rights reserved.  Email: ode4j@gmx.de   Web: www.ode4j.org        *
 *                                                                       *
 * This library is free software; you can redistribute it and/or         *
 * modify it under the terms of EITHER:                                  *
 *   (1) The GNU Lesser General Public License as published by the Free  *
 *       Software Foundation; either version 2.1 of the License, or (at  *
 *       your option) any later version. The text of the GNU Lesser      *
 *       General Public License is included with this library in the     *
 *       file LICENSE.TXT.                                               *
 *   (2) The BSD-style license that is included with this library in     *
 *       the file ODE-LICENSE-BSD.TXT and ODE4J-LICENSE-BSD.TXT.         *
 *                                                                       *
 * This library is distributed in the hope that it will be useful,       *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the files    *
 * LICENSE.TXT, ODE-LICENSE-BSD.TXT and ODE4J-LICENSE-BSD.TXT for more   *
 * details.                                                              *
 *                                                                       *
 *************************************************************************/
package org.ode4j.ode;

/**
 * OdeConfig class.
 *
 * @author Tilmann Zaeschke
 *
 */
public class OdeConfig {

	private static final boolean dDOUBLE = true;
	
	public enum TRIMESH {
		DISABLED,
		GIMPACT;
	}
	
	
	/** Do not use directly.
	 * TZ: For now the only option: DISABLED. */
	public static final TRIMESH dTRIMESH_TYPE = TRIMESH.GIMPACT;
	
	/**
	 * @return Whether double precision is used.
	 */
	public static boolean isDoublePrecision() {
		return dDOUBLE;
	}
	
	/**
	 * @return Whether any TRIMESH is enabled.
	 */
	public static boolean isTrimeshEnabled() {
		return dTRIMESH_TYPE != TRIMESH.DISABLED;
	}
	
/* Pull in the standard headers */
//#include <stdio.h>
//#include <stdlib.h>
//#include <stdarg.h>
//#include <math.h>
//#include <string.h>
//#include <float.h>

//#if defined(ODE_DLL) || defined(ODE_LIB) || !defined(_MSC_VER)
//#define __ODE__
//#endif
//
///* Define a DLL export symbol for those platforms that need it */
//#if defined(_MSC_VER)
//  #if defined(ODE_DLL)
//    #define ODE_API __declspec(dllexport)
//  #elif !defined(ODE_LIB)
//    #define ODE_DLL_API __declspec(dllimport)
//  #endif
//#endif
//
//#if !defined(ODE_API)
//  #define ODE_API
//#endif
//
//#if defined(_MSC_VER)
//#  define ODE_API_DEPRECATED __declspec(deprecated)
//#elif defined (__GNUC__) && ( (__GNUC__ > 3) || ((__GNUC__ == 3) && (__GNUC_MINOR__ >= 1)) )
//#  define ODE_API_DEPRECATED __attribute__((__deprecated__))
//#else
//#  define ODE_API_DEPRECATED
//#endif
//
///* Well-defined common data types...need to define for 64 bit systems */
//#if defined(_M_IA64) || defined(__ia64__) || defined(_M_AMD64) || defined(__x86_64__)
//  #define X86_64_SYSTEM   1
//  typedef int             int32;
//  typedef unsigned int    uint32;
//  typedef short           int16;
//  typedef unsigned short  uint16;
//  typedef char            int8;
//  typedef unsigned char   uint8;
//#else
//  typedef int             int32;
//  typedef unsigned int    uint32;
//  typedef short           int16;
//  typedef unsigned short  uint16;
//  typedef char            int8;
//  typedef unsigned char   uint8;
//#endif
//
///* Visual C does not define these functions */
//#if defined(_MSC_VER)
//  #define copysignf _copysign
//  #define copysign _copysign
//#endif



///* Define the dInfinity macro */
//#ifdef INFINITY
//  #define dInfinity INFINITY
//#elif defined(HUGE_VAL)
//  #ifdef dSINGLE
//    #ifdef HUGE_VALF
//      #define dInfinity HUGE_VALF
//    #else
//      #define dInfinity ((float)HUGE_VAL)
//    #endif
//  #else
//    #define dInfinity HUGE_VAL
//  #endif
//#else
//  #ifdef dSINGLE
//    #define dInfinity ((float)(1.0/0.0))
//  #else
//    #define dInfinity (1.0/0.0)
//  #endif
//#endif

}
