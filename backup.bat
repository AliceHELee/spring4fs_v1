FOR %%A in (s01 s02 s03a s03b s04 s05a s05b s06a s06b s06c s06d s07a s07b s07c s08a s08b s08c s08d s08e s09a s09b s10a s10b) ^
DO xcopy C:\Dev\spring4fs\%%A\*.* D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial\step1\%%A\*.* /e /h /k /Y

FOR %%A in (sw11a sw11b sw12a sw12b sw13a sw13b sw14a sw14b sw14c sw15a sw15b sw15c) ^
DO xcopy C:\Dev\spring4fs\%%A\*.* D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial\step2\%%A\*.* /e /h /k /Y

FOR %%A in (sw16my1 sw16or1 sw21my1 sw21my2 sw21my3 sw21or1 sw21or2 sw21or3 sw22my1 sw22my2 sw22or1 sw22or2 ) ^
DO xcopy C:\Dev\spring4fs\%%A\*.* D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial\step3\%%A\*.* /e /h /k /Y

FOR %%A in (sw23my1 sw23my2 sw23or1 sw23or2 sw25my1 sw25my2 sw25my3 sw25or1 sw25or2 sw25or3 sw26my1 sw26my2 sw26or1 sw26or2 sw27my1 sw27or1 sw28my1 sw28or1 sw29my1 sw29or1 sw30my1 sw30my2 sw30or1 sw30or2) ^
DO xcopy C:\Dev\spring4fs\%%A\*.* D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial\step4\%%A\*.* /e /h /k /Y

