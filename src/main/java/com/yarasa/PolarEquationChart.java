package com.yarasa;
import java.util.Random;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PolarAxisLocation;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import com.yarasa.math.EquationsDatabase;
import com.yarasa.math.PolarEquation;

public class PolarEquationChart extends ApplicationFrame {
    static int SCREEN_WIDTH = 500;
    static int SCREEN_HEIGHT = 500;

    private ChartPanel chartPanel;
    private Random randomEquation;

    PolarEquationChart(){
        super("Jaciara is crazy!");
        init();
        super.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        super.setResizable(false);
        setContentPane(chartPanel);
    }

    private void init(){
        randomEquation = new Random();
        setRandomChartPanel();
    }

    public void setRandomChartPanel(){
        int i = randomEquation.nextInt(EquationsDatabase.equationList.length);
        JFreeChart chartChoosed = loadChart(EquationsDatabase.equationList[i]);
        chartPanel = new ChartPanel(chartChoosed);
        setContentPane(chartPanel);
        chartPanel.setPreferredSize(new java.awt.Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
    }

    private JFreeChart loadChart(PolarEquation equation){
        XYDataset equationDataSet = loadEquationDataSet(equation);
        return createChart(equationDataSet, equation.getType().getName(), equation.getDescription());
    }

    private XYDataset loadEquationDataSet(PolarEquation equation){
        XYSeriesCollection data = new XYSeriesCollection();
        XYSeries series = new XYSeries("theta, R");
        double r;
        for(double theta = 0; theta <= 2*Math.PI; theta += (Math.PI/180)){
            r = equation.calculate(theta);
            series.add(Math.toDegrees(theta), r);
        }
        data.addSeries(series);
        return data;
        
    }

    private JFreeChart createChart(XYDataset data, String chartName, String description){
        ValueAxis eixoPolar = new NumberAxis();
        eixoPolar.setTickLabelsVisible(true);
        DefaultPolarItemRenderer renderer = new DefaultPolarItemRenderer();
        renderer.setShapesVisible(false);
        renderer.setSeriesFilled(0, true);
        PolarPlot plot = new PolarPlot(data, eixoPolar, renderer);
        plot.setCounterClockwise(true);
        plot.setAxisLocation(PolarAxisLocation.EAST_BELOW);
        plot.setAngleOffset(0);
        plot.addCornerTextItem(description);
        JFreeChart chart = new JFreeChart(chartName, plot);
        return chart;
    }
}
