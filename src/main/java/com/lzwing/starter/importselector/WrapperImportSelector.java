package com.lzwing.starter.importselector;

import com.lzwing.starter.service.WrapperService;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class WrapperImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{WrapperService.class.getName()};
	}
}
 
