//
//  AppVersion.m
//  Copyright (c) 2013 Alexis Reverte - http://www.matsiya.com
//

#import "Cordova/CDV.h"
#import "AppVersion.h"

@implementation AppVersion

- (void) getVersionNumber:(CDVInvokedUrlCommand*)command
{
    NSString* callbackID = command.callbackId;
    NSString* version = [[[NSBundle mainBundle] infoDictionary] objectForKey:@"CFBundleVersion"];
    
    CDVPluginResult *result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:version];
    [self writeJavascript:[result toSuccessCallbackString:callbackID]];
}

@end