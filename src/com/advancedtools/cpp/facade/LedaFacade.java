package com.advancedtools.cpp.facade;

import com.advancedtools.cpp.CppSupportLoader;
import com.intellij.ProjectTopics;
import com.intellij.codeInsight.navigation.GotoTargetHandler;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.icons.AllIcons;
import com.intellij.ide.util.PsiElementListCellRenderer;
import com.intellij.lang.Language;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkType;
import com.intellij.openapi.projectRoots.impl.ProjectJdkImpl;
import com.intellij.openapi.roots.ModuleRootListener;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.util.messages.MessageBusConnection;

import javax.swing.*;
import java.nio.charset.Charset;

public class LedaFacade extends EnvironmentFacade {

}
