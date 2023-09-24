package com.yarasa;

import org.jfree.ui.RefineryUtilities;

public class App {
    private PolarEquationChart chart;

    App(){
        chart = new PolarEquationChart();
        chart.pack();
        RefineryUtilities.positionFrameOnScreen(chart, 0, 1);
        chart.setVisible(true);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 0; i < InfraordiraryMemoriesDatabase.length(); i++){
                        Thread.sleep(1000);
                        changeWindow();
                        System.out.println("["+(i+1)+"] "+InfraordiraryMemoriesDatabase.getFrase(i));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r).start();
    }

    public void changeWindow(){
        chart.setRandomChartPanel();
        chart.pack();
        chart.setVisible(true);
    }

    public static void main( String[] args ) {
        new App();
    }
}
