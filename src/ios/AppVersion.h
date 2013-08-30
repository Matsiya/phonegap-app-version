//
//  AppVersion.h
//  Copyright (c) 2013 Alexis Reverte - http://www.matsiya.com
//

#import "Cordova/CDV.h"
#import "Foundation/Foundation.h"

@interface AppVersion : CDVPlugin

- (void) getVersionNumber:(CDVInvokedUrlCommand*)command;

@end