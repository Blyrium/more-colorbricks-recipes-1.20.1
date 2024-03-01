package net.blyrium.morecolorbricksrecipes;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreColorBricksRecipes implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("morecolorbricksrecipes");

	@Override
	public void onInitialize() {
		LOGGER.info("More ColorBricks Recipes initialized");
	}
}